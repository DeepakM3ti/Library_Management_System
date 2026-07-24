package com.library;

import java.time.LocalDate;

public class IssueBook {

    private int issueId;
    private int bookId;
    private String bookName;
    private String studentUSN;
    private String studentName;
    private LocalDate issueDate;
    private LocalDate dueDate;
    private LocalDate returnDate;
    private double fine;
    private String status;

    
    public IssueBook() //defalt
    {

    }

    
    public IssueBook(int issueId, int bookId, String bookName,
                     String studentUSN, String studentName,
                     LocalDate issueDate, LocalDate dueDate) 
    {

        this.issueId = issueId;
        this.bookId = bookId;
        this.bookName = bookName;
        this.studentUSN = studentUSN;
        this.studentName = studentName;
        this.issueDate = issueDate;
        this.dueDate = dueDate;
        this.returnDate = null;
        this.fine = 0;
        this.status = "Issued";
    }

   
    public int getIssueId() {
		return issueId;
	}

	public void setIssueId(int issueId) {
		this.issueId = issueId;
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

	public String getStudentUSN() {
		return studentUSN;
	}

	public void setStudentUSN(String studentUSN) {
		this.studentUSN = studentUSN;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public LocalDate getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(LocalDate issueDate) {
		this.issueDate = issueDate;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public LocalDate getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(LocalDate returnDate) {
		this.returnDate = returnDate;
	}

	public double getFine() {
		return fine;
	}

	public void setFine(double fine) {
		this.fine = fine;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	

	@Override
    public String toString() {

        return "\n=================GECR============================" +
               "\nIssue ID      : " + issueId +
               "\nBook ID       : " + bookId +
               "\nBook Name     : " + bookName +
               "\nStudent USN   : " + studentUSN +
               "\nStudent Name  : " + studentName +
               "\nIssue Date    : " + issueDate +
               "\nDue Date      : " + dueDate +
               "\nReturn Date   : " +
               (returnDate == null ? "Not Returned" : returnDate) +
               "\nFine          : ₹" + fine +
               "\nStatus        : " + status +
               "\n=================Thankyou=========================";
    }
}