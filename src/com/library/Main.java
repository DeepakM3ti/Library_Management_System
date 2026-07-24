package com.library;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Library library = new Library();

        int choice;
        
        System.out.println("==============================================================");
        System.out.println("         Government Engeneering College Raichur Library");
        System.out.println("==============================================================");
        System.out.println("    Librarian Name  : Mr. Ramesh Kumar   ");
        System.out.println("    Working Days    : Monday - Saturday  ");
        System.out.println("    Library Timings : 09:00 AM - 05:30 PM");
        System.out.println("    Lunch Break     : 01:00 PM - 02:00 PM");
        System.out.println("    Maximum Books   : 6 Books            ");
        System.out.println("    Issue Duration  : 15 Days           ");
        System.out.println("    Late Fine       : ₹50 Per Day       ");
        System.out.println("-------------------------------------------------------------------");

        do {

            System.out.println("\n=======================================");
            System.out.println("  GECR COLLEGE LIBRARY MANAGEMENT SYSTEM");
            System.out.println("=======================================");
            System.out.println("1. Gecr Librarian Login");
            System.out.println("2. Student Registration");
            System.out.println("3. Student Login");
            System.out.println("4. Exit");
            System.out.print("Enter Your Choice : ");

            choice = sc.nextInt();

            switch (choice) {

            case 1:

                if (library.librarianLogin()) {

                    int adminChoice;

                    do {

                        System.out.println("\n========== GECR LIBRARIAN MENU ==========");
                        System.out.println("1. Add Book");
                        System.out.println("2. View Books");
                        System.out.println("3. Search Book");
                        System.out.println("4. Register Student");
                        System.out.println("5. Issue Book");
                        System.out.println("6. Return Book");
                        System.out.println("7. View Issued Books");
                        System.out.println("8. Logout");
                        System.out.print("Enter Your Choice : ");

                        adminChoice = sc.nextInt();

                        switch (adminChoice) {

                        case 1:
                            library.addBook();
                            break;

                        case 2:
                            library.viewBooks();
                            break;

                        case 3:
                            library.searchBook();
                            break;

                        case 4:
                            library.registerStudent();
                            break;

                        case 5:
                            library.issueBook();
                            break;

                        case 6:
                            library.returnBook();
                            break;

                        case 7:
                            library.viewIssuedBooks();
                            break;

                        case 8:
                            System.out.println("Logged Out Successfully.");
                            break;

                        default:
                            System.out.println("Invalid Choice.");
                        }

                    } while (adminChoice != 8);
                }

                break;

            case 2:

                library.registerStudent();
                break;

            case 3:

                Student student = library.studentLogin();

                if (student != null) {

                    int studentChoice;

                    do {

                        System.out.println("\n========== STUDENT MENU ==========");
                        System.out.println("Welcome : " + student.getStudentName());
                        System.out.println("1. View Books");
                        System.out.println("2. Search Book");
                        System.out.println("3. Logout");
                        System.out.print("Enter Your Choice : ");

                        studentChoice = sc.nextInt();

                        switch (studentChoice) {

                        case 1:
                            library.viewBooks();
                            break;

                        case 2:
                            library.searchBook();
                            break;

                        case 3:
                            System.out.println("Logged Out Successfully.");
                            break;

                        default:
                            System.out.println("Invalid Choice.");
                        }

                    } while (studentChoice != 3);
                }

                break;

            case 4:

                System.out.println("Thank You! Visit Again.");
                break;

            default:

                System.out.println("Invalid Choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}