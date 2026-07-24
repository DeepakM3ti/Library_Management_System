package com.library;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;


public class Library {

    Scanner sc = new Scanner(System.in);

    public Library() {
        LibraryData.loadData();
    }

    public void addBook() {

        System.out.println("\n============= Add Boook  =============");

        System.out.print("Enter Book ID : ");
        int bookId = sc.nextInt();
        sc.nextLine();

        if (Validation.isDuplicateBookId(LibraryData.books, bookId)) {
            System.out.println("Book ID Already Exists.");
            return;
        }

        System.out.print("Enter Book Name : ");
        String bookName = sc.nextLine();

        if (!Validation.isValidBookName(bookName)) {
            System.out.println("Invalid Book Name.");
            return;
        }

        if (Validation.isDuplicateBookName(LibraryData.books, bookName)) {
            System.out.println("Book Name Already Exists.");
            return;
        }

        System.out.print("Enter Author Name : ");
        String author = sc.nextLine();

        if (!Validation.isValidAuthor(author)) {
            System.out.println("Invalid Author Name.");
            return;
        }

        System.out.print("Enter Department : ");
        String department = sc.next();

        if (!Validation.isValidDepartment(department)) {
            System.out.println("Invalid Department.");
            return;
        }

        System.out.print("Enter Rack Number : ");
        String rack = sc.next();

        System.out.print("Enter Price : ");
        double price = sc.nextDouble();

        if (!Validation.isValidPrice(price)) {
            System.out.println("Invalid Price.");
            return;
        }

        System.out.print("Enter Total Copies : ");
        int copies = sc.nextInt();

        if (!Validation.isValidQuantity(copies)) {
            System.out.println("Invalid Quantity.");
            return;
        }

        Book book = new Book(bookId, bookName, author,
                department, rack, price, copies);

        LibraryData.books.add(book);
        LibraryData.bookMap.put(bookId, book);

        System.out.println("\nBook Added Successfully.");
    }

    public void viewBooks() {

        if (LibraryData.books.isEmpty()) {
            System.out.println("No Books Available.");
            return;
        }

        System.out.println("---------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-8s %-30s %-20s %-10s %-8s %-10s %-8s %-10s%n",
                "ID", "BOOK NAME", "AUTHOR", "DEPT", "RACK", "PRICE", "TOTAL", "AVAILABLE");
        System.out.println("---------------------------------------------------------------------------------------------------------------");

        for (Book book : LibraryData.books) {

            System.out.printf("%-8d %-30s %-20s %-10s %-8s %-10.2f %-8d %-10d%n",
                    book.getBookId(),
                    book.getBookName(),
                    book.getAuthor(),
                    book.getDepartment(),
                    book.getRackNumber(),
                    book.getPrice(),
                    book.getTotalCopies(),
                    book.getAvailableCopies());
        }

        System.out.println("---------------------------------------------------------------------------------------------------------------");
    }
    
    public void searchBook() {

        System.out.println("\n========== SEARCH BOOK ==========");
        System.out.println("1. Search by Book ID");
        System.out.println("2. Search by Book Name");
        System.out.println("3. Search by Author");
        System.out.print("Enter Your Choice : ");

        System.out.print("Enter Your Choice : ");

        while (!sc.hasNextInt()) {
            System.out.println("Invalid Choice! Please enter numbers only.");
            System.out.print("Enter Your Choice : ");
            sc.next(); // Remove invalid input
        }

        int choice = sc.nextInt();
        sc.nextLine();
        boolean found = false;

        System.out.println("---------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-8s %-30s %-20s %-10s %-8s %-10s %-8s %-10s%n",
                "ID", "BOOK NAME", "AUTHOR", "DEPT", "RACK",
                "PRICE", "TOTAL", "AVAILABLE");
        System.out.println("---------------------------------------------------------------------------------------------------------------");

        switch (choice) {

        case 1:
        	System.out.print("Enter Book ID : ");

        	while (!sc.hasNextInt()) {
        	    System.out.println("Invalid Book ID! Please enter numbers only.");
        	    System.out.print("Enter Book ID : ");
        	    sc.next();
        	}

        	int id = sc.nextInt();
        	sc.nextLine();  
        	
            for (Book book : LibraryData.books) {

                if (book.getBookId() == id) {

                    System.out.printf("%-8d %-30s %-20s %-10s %-8s %-10.2f %-8d %-10d%n",
                            book.getBookId(),
                            book.getBookName(),
                            book.getAuthor(),
                            book.getDepartment(),
                            book.getRackNumber(),
                            book.getPrice(),
                            book.getTotalCopies(),
                            book.getAvailableCopies());

                    found = true;
                    break;
                }
            }

            break;

        case 2:

            System.out.print("Enter Book Name : ");
            String name = sc.nextLine();

            for (Book book : LibraryData.books) {

                if (book.getBookName().toLowerCase().contains(name.toLowerCase())) {

                    System.out.printf("%-8d %-30s %-20s %-10s %-8s %-10.2f %-8d %-10d%n",
                            book.getBookId(),
                            book.getBookName(),
                            book.getAuthor(),
                            book.getDepartment(),
                            book.getRackNumber(),
                            book.getPrice(),
                            book.getTotalCopies(),
                            book.getAvailableCopies());

                    found = true;
                }
            }

            break;

        case 3:

            System.out.print("Enter Author Name : ");
            String author = sc.nextLine();

            for (Book book : LibraryData.books) {

                if (book.getAuthor().toLowerCase().contains(author.toLowerCase())) {

                    System.out.printf("%-8d %-30s %-20s %-10s %-8s %-10.2f %-8d %-10d%n",
                            book.getBookId(),
                            book.getBookName(),
                            book.getAuthor(),
                            book.getDepartment(),
                            book.getRackNumber(),
                            book.getPrice(),
                            book.getTotalCopies(),
                            book.getAvailableCopies());

                    found = true;
                }
            }

            break;

        default:
            System.out.println("Invalid Choice.");
            return;
        }

        if (!found) {
            System.out.println("Book Not Found.");
        }

        System.out.println("---------------------------------------------------------------------------------------------------------------");
    }
    public void registerStudent() {

        sc.nextLine();

        System.out.println("\n=============== Gecr Student Registration =====");

        System.out.print("Enter Student Name : ");
        String name = sc.nextLine();

        if (!Validation.isValidStudentName(name)) {
            System.out.println("Invalid Student Name.");
            return;
        }

        System.out.print("Enter USN : ");
        String usn = sc.next().toUpperCase();

        if (!Validation.isValidUSN(usn)) {
            System.out.println("Invalid USN.");
            return;
        }

        if (Validation.isDuplicateUSN(LibraryData.students, usn)) {
            System.out.println("USN Already Registered.");
            return;
        }

        System.out.print("Enter Department : ");
        String department = sc.next();

        if (!Validation.isValidDepartment(department)) {
            System.out.println("Invalid Department.");
            return;
        }

        System.out.print("Enter Year : ");
        int year = sc.nextInt();

        if (!Validation.isValidYear(year)) {
            System.out.println("Invalid Year.");
            return;
        }

        System.out.print("Enter Phone Number : ");
        String phone = sc.next();

        if (!Validation.isValidPhone(phone)) {
            System.out.println("Invalid Phone Number.");
            return;
        }

        System.out.print("Enter Email : ");
        String email = sc.next();

        if (!Validation.isValidEmail(email)) {
            System.out.println("Invalid Email.");
            return;
        }

        String password = Validation.generatePassword(name, usn);

        Student student = new Student(
                usn,
                name,
                department,
                year,
                phone,
                email,
                password);

        LibraryData.students.add(student);
        LibraryData.studentMap.put(usn, student);

        System.out.println("\n Gecr Student Registered Successfully.");
        System.out.println("USN      : " + usn);
        System.out.println("Password : " + password);
    }

    public Student studentLogin() {

        System.out.println("\n=====Gecr Student Login ======");

        System.out.print("Enter USN : ");
        String usn = sc.next().toUpperCase();

        Student student = LibraryData.studentMap.get(usn);

        if (student == null) {

            System.out.println("Gecr Student Not Registered.");
            return null;
        }

        int attempts = 3;

        while (attempts > 0) {

            System.out.print("Enter Password : ");
            String password = sc.next();

            if (student.getPassword().equals(password)) {

                System.out.println("\nLogin Successful.");
                System.out.println("Welcome " + student.getStudentName());

                return student;
            }

            attempts--;

            if (attempts > 0) {
                System.out.println("Invalid Password.");
                System.out.println("Attempts Left : " + attempts);
            }
        }

        System.out.println("Account Locked.");
        return null;
    }

    public boolean librarianLogin() {

        System.out.println("\n===== Gecr librarian login =====");

        System.out.print("Enter Username : ");
        String username = sc.next();

        System.out.print("Enter Password : ");
        String password = sc.next();

        if (username.equals("Gecrlibrary") && password.equals("gecr@5841")) {

            System.out.println("Login Successful.");
            return true;
        }

        System.out.println("Invalid Username or Password.");
        return false;
    }
    public void issueBook() {

        System.out.println("\n========== Isuue book ==========");

        System.out.print("Enter Student USN : ");
        String usn = sc.next().toUpperCase();

        Student student = LibraryData.studentMap.get(usn);

        if (student == null) {
            System.out.println("Student Not Registered.");
            return;
        }

        int remainingBooks = 6 - student.getBooksIssued();

        if (remainingBooks == 0) {
            System.out.println("You have already issued the maximum of 6 books.");
            return;
        }

        System.out.println("Books Already Issued : " + student.getBooksIssued());
        System.out.println("You Can Issue        : " + remainingBooks);

        System.out.print("How Many Books Do You Want To Issue : ");

        while (!sc.hasNextInt()) {
            System.out.println("Invalid Input! Enter Numbers Only.");
            System.out.print("How Many Books Do You Want To Issue : ");
            sc.next();
        }

        int count = sc.nextInt();

        if (count <= 0) {
            System.out.println("Invalid Number Of Books.");
            return;
        }

        if (count > remainingBooks) {
            System.out.println("You Can Issue Only " + remainingBooks + " Book(s).");
            return;
        }

        for (int i = 1; i <= count; i++) {

            System.out.println("\nBook " + i);

            System.out.print("Enter Book ID : ");

            while (!sc.hasNextInt()) {
                System.out.println("Invalid Book ID.");
                System.out.print("Enter Book ID : ");
                sc.next();
            }

            int bookId = sc.nextInt();

            Book book = LibraryData.bookMap.get(bookId);

            if (book == null) {
                System.out.println("Book Not Found.");
                i--;
                continue;
            }

            if (book.getAvailableCopies() == 0) {
                System.out.println("Book Out Of Stock.");
                i--;
                continue;
            }

            boolean alreadyIssued = false;

            for (IssueBook issue : LibraryData.issuedBooks) {

                if (issue.getStudentUSN().equals(usn)
                        && issue.getBookId() == bookId
                        && issue.getStatus().equalsIgnoreCase("Issued")) {

                    alreadyIssued = true;
                    break;
                }
            }

            if (alreadyIssued) {
                System.out.println("You Have Already Issued This Book.");
                i--;
                continue;
            }

            IssueBook issue = new IssueBook(
                    LibraryData.issuedBooks.size() + 1,
                    book.getBookId(),
                    book.getBookName(),
                    student.getUsn(),
                    student.getStudentName(),
                    java.time.LocalDate.now(),
                    java.time.LocalDate.now().plusDays(15));

            LibraryData.issuedBooks.add(issue);

            book.setAvailableCopies(book.getAvailableCopies() - 1);

            student.setBooksIssued(student.getBooksIssued() + 1);

            System.out.println("Book Issued Successfully.");
            System.out.println("Book Name : " + book.getBookName());
            System.out.println("Due Date  : " + java.time.LocalDate.now().plusDays(15));
        }

        System.out.println("\n==================================");
        System.out.println("Books Currently Issued : " + student.getBooksIssued() + "/6");
        System.out.println("==================================");
    }
    public void returnBook() {

    System.out.println("\n========== Return book ==========");

    String usn;
    Student student;

    while (true) {

        System.out.print("Enter Student USN : ");
        usn = sc.next().toUpperCase();

        if (!Validation.isValidUSN(usn)) {
            System.out.println("Invalid USN Format! Please Try Again.\n");
            continue;
        }

        student = LibraryData.studentMap.get(usn);

        if (student == null) {
            System.out.println("Student Not Registered! Please Try Again.\n");
            continue;
        }

        break;
    }

    int bookId;

    while (true) {

        System.out.print("Enter Book ID : ");

        if (!sc.hasNextInt()) {
            System.out.println("Invalid Book ID! Enter Numbers Only.");
            sc.next();
            continue;
        }

        bookId = sc.nextInt();

        if (!LibraryData.bookMap.containsKey(bookId)) {
            System.out.println("Book ID Not Found! Please Try Again.\n");
            continue;
        }

        break;
    }

    IssueBook issue = null;

    for (IssueBook i : LibraryData.issuedBooks) {

        if (i.getStudentUSN().equalsIgnoreCase(usn)
                && i.getBookId() == bookId
                && i.getStatus().equalsIgnoreCase("Issued")) {

            issue = i;
            break;
        }
    }

    if (issue == null) {
        System.out.println("This student has not issued this book.");
        return;
    }

    Book book = LibraryData.bookMap.get(bookId);

    LocalDate returnDate;

    while (true) {

        System.out.print("Enter Return Date (yyyy-MM-dd) : ");
        String date = sc.next();

        try {

            returnDate = LocalDate.parse(date);

            if (returnDate.isBefore(issue.getIssueDate())) {
                System.out.println("Return Date cannot be before Issue Date.");
                continue;
            }

            break;

        } catch (Exception e) {

            System.out.println("Invalid Date Format! Please use yyyy-MM-dd.");
        }
    }

    issue.setReturnDate(returnDate);

    long lateDays = ChronoUnit.DAYS.between(issue.getDueDate(), returnDate);
    double fine = 0;

    if (lateDays > 0) {
        fine = lateDays * 50;
    }

    issue.setFine(fine);
    issue.setStatus("Returned");

    book.setAvailableCopies(book.getAvailableCopies() + 1);

    student.setBooksIssued(student.getBooksIssued() - 1);

    System.out.println("\n========================================");
    System.out.println("      BOOK RETURNED SUCCESSFULLY");
    System.out.println("========================================");
    System.out.println("Student Name : " + student.getStudentName());
    System.out.println("Book Name    : " + book.getBookName());
    System.out.println("Issue Date   : " + issue.getIssueDate());
    System.out.println("Due Date     : " + issue.getDueDate());
    System.out.println("Return Date  : " + returnDate);

    if (lateDays > 0) {
        System.out.println("Late Days    : " + lateDays);
        System.out.println("Fine         : ₹" + fine);
    } else {
        System.out.println("Returned On Time");
        System.out.println("Fine         : ₹0");
    }

    System.out.println("Books With Student : " + student.getBooksIssued() + "/6");
    System.out.println("========================================");
}
    public void viewIssuedBooks() {

        if (LibraryData.issuedBooks.isEmpty()) {

            System.out.println("No Books Issued.");
            return;
        }

        for (IssueBook issue : LibraryData.issuedBooks) {

            System.out.println(issue);
        }
    }
}