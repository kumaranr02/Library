package com.libraryms.library.dal;

import java.util.List;

import com.libraryms.library.model.Book;

public interface IBookDAO {
    void addBook(Book book);
    List<Book> getAllBooks();
    Book getBookByISBN(String isbn);
    void updateBook(Book book,String isbn);
    void deleteBook(String isbn);
}
