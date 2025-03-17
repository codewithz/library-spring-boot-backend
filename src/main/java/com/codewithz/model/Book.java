package com.codewithz.model;

import java.time.LocalDateTime;

public class Book {

    private Integer bookId;

    private String title;

    private String author;

    private String isbn;

    private int publishedYear;

    private int totalStock;

    private int availableStock;

    private int staffId;

    private LocalDateTime addedOn;


    public Book() {
    }

    public Book(Integer bookId, String title, String author, String isbn, int publishedYear, int totalStock, int availableStock, int staffId, LocalDateTime addedOn) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publishedYear = publishedYear;
        this.totalStock = totalStock;
        this.availableStock = availableStock;
        this.staffId = staffId;
        this.addedOn = addedOn;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    public int getTotalStock() {
        return totalStock;
    }

    public void setTotalStock(int totalStock) {
        this.totalStock = totalStock;
    }

    public int getAvailableStock() {
        return availableStock;
    }

    public void setAvailableStock(int availableStock) {
        this.availableStock = availableStock;
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public LocalDateTime getAddedOn() {
        return addedOn;
    }

    public void setAddedOn(LocalDateTime addedOn) {
        this.addedOn = addedOn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", publishedYear=" + publishedYear +
                ", totalStock=" + totalStock +
                ", availableStock=" + availableStock +
                ", staffId=" + staffId +
                ", addedOn=" + addedOn +
                '}';
    }
}
