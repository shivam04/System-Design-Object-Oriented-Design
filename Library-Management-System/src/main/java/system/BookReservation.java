package system;

import common.ReservationStatus;

import java.util.Date;

/**
 * Created by shivam.si on 10/02/21 5:39 pm
 */
public class BookReservation {
    private Date creationDate;
    private ReservationStatus status;
    private String bookItemBarcode;
    private String memberId;

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public ReservationStatus getStatus() {
        return status;
    }

    public void setStatus(ReservationStatus status) {
        this.status = status;
    }

    public String getBookItemBarcode() {
        return bookItemBarcode;
    }

    public void setBookItemBarcode(String bookItemBarcode) {
        this.bookItemBarcode = bookItemBarcode;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public static BookReservation fetchReservationDetails(String barCode) {
        //fetch data from db based on barcode if present return BookReservation object else
        return null;
    }

    public void sendBookAvailableNotification() {
        ///
    }

    public static boolean reserveBook(String barCode, String memberId) {
        //store book reservation details if not successful return false else
        return true;
    }
}
