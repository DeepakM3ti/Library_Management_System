package com.library;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class Validation 
{
    public static boolean isValidUSN(String usn) 
    {
    	String regex = "^[1-4][A-Z]{2}[0-9]{2}[A-Z]{2}[0-9]{3}$";

        return Pattern.matches(regex, usn);
    }

     public static boolean isValidStudentName(String name) {

        String regex = "^[A-Za-z ]{3,30}$";

        return Pattern.matches(regex, name);
    }

     public static boolean isValidPhone(String phone) {

        String regex = "^[6-9][0-9]{9}$";

        return Pattern.matches(regex, phone);
    }

      public static boolean isValidEmail(String email) {

        String regex =
                "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";

        return Pattern.matches(regex, email);
    }

    public static boolean isValidDepartment(String department) {

        return department.equalsIgnoreCase("CSE") ||
               department.equalsIgnoreCase("ECE") ||
               department.equalsIgnoreCase("EEE") ||
               department.equalsIgnoreCase("ME") ||
               department.equalsIgnoreCase("ISE") ||
               department.equalsIgnoreCase("CIVIL") ||
               department.equalsIgnoreCase("MBA");
    }

    
    public static boolean isValidBookName(String bookName) {

        String regex = "^[A-Za-z0-9 ]{3,50}$";

        return Pattern.matches(regex, bookName);
    }

    
    public static boolean isValidAuthor(String author) {

        String regex = "^[A-Za-z .]{3,40}$";

        return Pattern.matches(regex, author);
    }

  

    public static boolean isValidPrice(double price) {

        return price > 0 && price <= 10000;
    }

     public static boolean isValidQuantity(int quantity) {

        return quantity > 0 && quantity <= 100;
    }

    public static boolean isValidYear(int year) {

        return year >= 1 && year <= 4;
    }

      public static boolean isDuplicateUSN(ArrayList<Student> students,
                                         String usn) {

        for (Student student : students) {

            if (student.getUsn().equalsIgnoreCase(usn)) {

                return true;
            }
        }

        return false;
    }

     public static boolean isDuplicateBookId(ArrayList<Book> books,
                                            int bookId) {

        for (Book book : books) {

            if (book.getBookId() == bookId) {

                return true;
            }
        }

        return false;
    }

     public static boolean isDuplicateBookName(ArrayList<Book> books,
                                              String bookName) {

        for (Book book : books) {

            if (book.getBookName().equalsIgnoreCase(bookName)) {

                return true;
            }
        }

        return false;
    }

       public static String generatePassword(String studentName, String usn) {

        studentName = studentName.trim();

        String firstFour;

        if (studentName.length() >= 4) {

            firstFour = studentName.substring(0, 4);

        } else {

            firstFour = studentName;
        }

        String lastFour = usn.substring(usn.length() - 4);

        return firstFour + lastFour;
    }

}