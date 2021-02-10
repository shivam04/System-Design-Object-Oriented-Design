package user;

import book.Book;

import java.util.List;

/**
 * Created by shivam.si on 10/02/21 5:36 pm
 */
public class Author extends Member{
    List<Book> books;

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public boolean addBook(Book book) {
        this.books.add(book);
        return true;
    }
}
