package user;

import book.BookItem;
import common.BookStatus;
import common.Constants;
import common.ReservationStatus;
import system.BookLending;
import system.BookReservation;
import system.Fine;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

/**
 * Created by shivam.si on 10/02/21 5:33 pm
 */
public class Member extends Account{
    private Integer totalBookCheckout;
    private Date dateOfMembership;

    public Integer getTotalBookCheckout() {
        return totalBookCheckout;
    }

    public void setTotalBookCheckout(Integer totalBookCheckout) {
        this.totalBookCheckout = totalBookCheckout;
    }

    public Date getDateOfMembership() {
        return dateOfMembership;
    }

    public void setDateOfMembership(Date dateOfMembership) {
        this.dateOfMembership = dateOfMembership;
    }

    private void incrementTotalBookCheckout() {
        this.totalBookCheckout++;
    }

    private void decrementTotalBookCheckout() {
        this.totalBookCheckout--;
    }

    public boolean checkoutBookItem(BookItem bookItem) throws ParseException {
        if(this.totalBookCheckout >= Constants.MAX_BOOKS_ISSUED_TO_A_USER) {
            System.out.println("The user has already checked-out maximum number of books");
            return false;
        }

        BookReservation bookReservation = BookReservation.fetchReservationDetails(bookItem.getBarcode());
        if(bookReservation != null && bookReservation.getMemberId() != this.getAccountId()) {
            System.out.println("This book is reserved by another member");
            return false;
        } else if (bookReservation != null){
            bookReservation.setStatus(ReservationStatus.COMPLETED);
        }

        if(!bookItem.checkout(this.getAccountId())) {
            return false;
        }
        DateFormat formatter = new SimpleDateFormat("dd-mm-yyyy HH:MM:SS");
        bookItem.setDueDate(formatter.parse(LocalDate.now().plusDays(Constants.MAX_LENDING_DAYS).toString()));
        this.incrementTotalBookCheckout();
        return true;
    }

    public void returnBook(BookItem bookItem) {
        this.checkForFine(bookItem.getBarcode());
        BookReservation bookReservation = BookReservation.fetchReservationDetails(bookItem.getBarcode());
        if (bookReservation != null) {
            bookItem.setStatus(BookStatus.RESERVED);
            bookReservation.sendBookAvailableNotification();
        }
        this.decrementTotalBookCheckout();
        bookItem.setStatus(BookStatus.AVAILABLE);
    }


    public boolean renewBook(BookItem bookItem) throws ParseException {
        this.checkForFine(bookItem.getBarcode());
        BookReservation bookReservation = BookReservation.fetchReservationDetails(bookItem.getBarcode());
        if(bookReservation != null && bookReservation.getMemberId() != this.getAccountId()) {
            System.out.println("This book is reserved by another member");
            this.decrementTotalBookCheckout();
            bookItem.setStatus(BookStatus.RESERVED);
            bookReservation.sendBookAvailableNotification();
            return false;
        } else if (bookReservation != null){
            bookReservation.setStatus(ReservationStatus.COMPLETED);
        }
        if(!BookLending.bookLend(bookItem.getBarcode(), this.getAccountId())) {
            return false;
        }
        DateFormat formatter = new SimpleDateFormat("dd-mm-yyyy HH:MM:SS");
        bookItem.setDueDate(formatter.parse(LocalDate.now().plusDays(Constants.MAX_LENDING_DAYS).toString()));
        return true;
    }

    private void checkForFine(String barcode) {
        BookLending bookLending = BookLending.fetchBookLendingDetails(barcode);
        Date dueDate = bookLending.getDueDate();
        Date today = new Date();
        if (today.compareTo(dueDate) > 0) {
            long diff = today.getTime() - dueDate.getTime();
            long diffDays = diff / (24 * 60 * 60 * 1000);
            Fine.collectFine(this.getAccountId(), diffDays);
        }
    }

    public boolean reserveBookItem(BookItem bookItem) throws ParseException {
        if(!BookReservation.reserveBook(bookItem.getBarcode(), this.getAccountId())) {
            return false;
        }
        return true;
    }
}
