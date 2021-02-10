package book;

import user.Author;

import java.util.Date;
import java.util.List;

/**
 * Created by shivam.si on 10/02/21 5:35 pm
 */
public class Book {
    private String bookId;
    private String title;
    private String subject;
    private Date publisedDate;
    private Integer numberOfPages;
    private String publisher;
    private List<Author> authors;

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Date getPublisedDate() {
        return publisedDate;
    }

    public void setPublisedDate(Date publisedDate) {
        this.publisedDate = publisedDate;
    }

    public Integer getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(Integer numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }
}
