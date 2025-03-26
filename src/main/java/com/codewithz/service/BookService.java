package com.codewithz.service;

import com.codewithz.model.Book;
import com.codewithz.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class BookService {

    BookRepository bookRepository;
    @Autowired
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book getBookById(int id) {
        return bookRepository.findById(id).orElse(null);
    }

    public String addBook(Book book) {
        Book addedBook=bookRepository.save(book);
        if(addedBook != null){
            return "Book added successfully with id: "+addedBook.getBookId();
        }
        return null;
    }

    public String updateBook(Book book,int id) {
        book.setBookId(id);
        Book updatedBook=bookRepository.save(book);
        if (updatedBook != null){
            return "Book updated successfully with id: "+updatedBook.getBookId();
        }
        return null;
    }

    public String deleteBook(int id) {
        bookRepository.deleteById(id);
        return "Book deleted successfully with id: "+id;
    }

//    private static List<Book> BOOK_LIST = null;
//
//    static {
//        BOOK_LIST = List.of(
//                new Book(1, "Clean Code", "Robert C. Martin", "978-0132350884", 2008, 10, 7, 101, LocalDateTime.now()),
//                new Book(2, "Effective Java", "Joshua Bloch", "978-0134685991", 2018, 15, 10, 102, LocalDateTime.now()),
//                new Book(3, "Design Patterns", "Erich Gamma", "978-0201633610", 1994, 12, 5, 103, LocalDateTime.now()),
//                new Book(4, "Refactoring", "Martin Fowler", "978-0201485677", 1999, 8, 4, 104, LocalDateTime.now()),
//                new Book(5, "The Pragmatic Programmer", "Andrew Hunt", "978-0201616224", 1999, 20, 15, 105, LocalDateTime.now())
//        );
//    }

}
