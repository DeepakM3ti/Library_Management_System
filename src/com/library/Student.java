package com.library;

public class Student {

    private String usn;
    private String studentName;
    private String department;
    private int year;
    private String phoneNumber;
    private String email;
    private String password;
    private int booksIssued;

   
    public Student() //default
    {

    }

    
    public Student(String usn, String studentName, String department,
                   int year, String phoneNumber,
                   String email, String password) //parmeterized
    
    {

        this.usn = usn;
        this.studentName = studentName;
        this.department = department;
        this.year = year;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.password = password;
        this.booksIssued = 0;
    }

   

    public String getUsn() {
		return usn;
	}

	public void setUsn(String usn) {
		this.usn = usn;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getBooksIssued() {
		return booksIssued;
	}

	public void setBooksIssued(int booksIssued) {
		this.booksIssued = booksIssued;
	}

	@Override
    public String toString() {

        return "USN             : " + usn +
               "\nStudent Name    : " + studentName +
               "\nDepartment      : " + department +
               "\nYear            : " + year +
               "\nPhone Number    : " + phoneNumber +
               "\nEmail           : " + email +
               "\nBooks Issued    : " + booksIssued +
               "\n----------------------------------------";
    }
}