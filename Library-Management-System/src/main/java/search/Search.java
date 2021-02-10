package search;

import book.Book;

import java.util.Date;
import java.util.List;

/**
 * Created by shivam.si on 10/02/21 6:24 pm
 */
public interface Search {
    public List<Book> searchByTitle(String title);
    public List<Book> searchByAuthor(String author);
    public List<Book> searchBySubject(String subject);
    public List<Book> searchByPubDate(Date publishDate);
}
