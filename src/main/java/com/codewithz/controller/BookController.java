package com.codewithz.controller;

import com.codewithz.model.Book;
import com.codewithz.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    BookService bookService;

    @Autowired
    public void setBookService(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable(name = "id") int id){
        return bookService.getBookById(id);
    }

    @PostMapping
    public String addBook(@RequestBody Book book){
        return bookService.addBook(book);
    }

    @PutMapping("/{id}")
    public String updateBook(@RequestBody Book book, @PathVariable(name = "id") int id){
        return bookService.updateBook(book, id);
    }
    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable(name = "id") int id){
        return bookService.deleteBook(id);
    }
}
