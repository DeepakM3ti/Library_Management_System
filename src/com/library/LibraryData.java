package com.library;

import java.util.ArrayList;
import java.util.HashMap;

public class LibraryData {

    public static ArrayList<Book> books = new ArrayList<>();

    public static ArrayList<Student> students = new ArrayList<>();

    public static ArrayList<IssueBook> issuedBooks = new ArrayList<>();

    public static HashMap<Integer, Book> bookMap = new HashMap<>();

    public static HashMap<String, Student> studentMap = new HashMap<>();

    	public static void loadData() {

    	    if (!books.isEmpty()) {
    	        return;
    	    }

    	    books.add(new Book(101,"Engineering Mathematics I","B.S. Grewal","COMMON","R1",650,10));
    	    books.add(new Book(102,"Engineering Mathematics II","B.S. Grewal","COMMON","R1",680,10));
    	    books.add(new Book(103,"Engineering Physics","S. Chand","COMMON","R1",550,8));
    	    books.add(new Book(104,"Engineering Chemistry","Jain & Jain","COMMON","R1",500,8));
    	    books.add(new Book(105,"Programming in C","Dennis Ritchie","CSE","R2",600,10));
    	    books.add(new Book(106,"Programming in C++","Bjarne Stroustrup","CSE","R2",700,8));
    	    books.add(new Book(107,"Core Java","Herbert Schildt","CSE","R2",750,10));
    	    books.add(new Book(108,"Advanced Java","Herbert Schildt","CSE","R2",800,8));
    	    books.add(new Book(109,"Python Programming","Guido van Rossum","CSE","R2",650,10));
    	    books.add(new Book(110,"Data Structures","Seymour Lipschutz","CSE","R2",700,8));
    	    books.add(new Book(111,"Algorithms","Thomas H. Cormen","CSE","R3",950,6));
    	    books.add(new Book(112,"Operating System Concepts","Galvin","CSE","R3",900,8));
    	    books.add(new Book(113,"Computer Networks","Andrew S. Tanenbaum","CSE","R3",850,8));
    	    books.add(new Book(114,"Database Management System","Korth","CSE","R3",850,8));
    	    books.add(new Book(115,"Software Engineering","Ian Sommerville","CSE","R3",900,8));
    	    books.add(new Book(116,"Compiler Design","Aho","CSE","R3",950,6));
    	    books.add(new Book(117,"Theory of Computation","Hopcroft","CSE","R4",850,8));
    	    books.add(new Book(118,"Computer Organization","Morris Mano","CSE","R4",800,8));
    	    books.add(new Book(119,"Computer Architecture","William Stallings","CSE","R4",900,6));
    	    books.add(new Book(120,"Artificial Intelligence","Elaine Rich","CSE","R4",950,6));
    	    books.add(new Book(121,"Machine Learning","Tom Mitchell","CSE","R4",1000,5));
    	    books.add(new Book(122,"Deep Learning","Ian Goodfellow","CSE","R4",1200,4));
    	    books.add(new Book(123,"Cloud Computing","Rajkumar Buyya","CSE","R5",900,6));
    	    books.add(new Book(124,"Cyber Security","Charles Brooks","CSE","R5",850,8));
    	    books.add(new Book(125,"HTML and CSS","Jon Duckett","CSE","R5",650,10));
    	    books.add(new Book(126,"JavaScript","David Flanagan","CSE","R5",850,8));
    	    books.add(new Book(127,"React JS","Alex Banks","CSE","R5",900,6));
    	    books.add(new Book(128,"ASP.NET Core","Adam Freeman","CSE","R5",950,5));
    	    books.add(new Book(129,"C# Programming","Andrew Troelsen","CSE","R6",850,8));
    	    books.add(new Book(130,"SQL","Ramez Elmasri","CSE","R6",800,8));

    	    for (Book b : books) {
    	        bookMap.put(b.getBookId(), b);
    	    }
    	

    }

}