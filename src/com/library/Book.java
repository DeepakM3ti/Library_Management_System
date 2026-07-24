package com.library;

public class Book {

    private int bookId;
    private String bookName;
    private String author;
    private String department;
    private String rackNumber;
    private double price;
    private int totalCopies;
    private int availableCopies;

    public Book() {

    }

    public Book(int bookId, String bookName, String author,
                String department, String rackNumber,
                double price, int totalCopies) {

        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.department = department;
        this.rackNumber = rackNumber;
        this.price = price;
        this.totalCopies = totalCopies;
        this.availableCopies = totalCopies;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getRackNumber() {
        return rackNumber;
    }

    public void setRackNumber(String rackNumber) {
        this.rackNumber = rackNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getTotalCopies() {
        return totalCopies;
    }

    public void setTotalCopies(int totalCopies) {
        this.totalCopies = totalCopies;
    }

    public int getAvailableCopies() {
        return availableCopies;
    }

    public void setAvailableCopies(int availableCopies) {
        this.availableCopies = availableCopies;
    }

    @Override
    public String toString() {

        return "\n=============================="
                + "\nBook ID          : " + bookId
                + "\nBook Name        : " + bookName
                + "\nAuthor           : " + author
                + "\nDepartment       : " + department
                + "\nRack Number      : " + rackNumber
                + "\nPrice            : ₹" + price
                + "\nTotal Copies     : " + totalCopies
                + "\nAvailable Copies : " + availableCopies
                + "\n==============================";
    }
}