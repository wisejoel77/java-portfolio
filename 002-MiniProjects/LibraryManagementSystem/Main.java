package com.wisejoel77.LibraryManagementSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Creating Library Items
        Book b1 = new Book("B001", "Wise Kid", true, "Arnold", "The GOAT", 77);
        Book b2 = new Book("B002", "Wise Teenager", true, "Joel", "The GOAT", 77);
        Magazine m1 = new Magazine("M001", "Artificial Intelligence", true, 1);
        Magazine m2 = new Magazine("M002", "Machine Learning", true, 2);

        // Creating Users
        Student s1 = new Student("23ME1A0546", "Joel");
        Professor p1 = new Professor("P001", "Runa");

        // Creating Library
        Library library = new Library();
        System.out.println("Adding books: ");
        library.addBook(b1);
        library.addBook(b2);
        System.out.println();
        library.displayBooks();
        System.out.println("\nRemoving a book");
        library.removeBook(b2.itemId);
        System.out.println();
        library.displayBooks();

        System.out.println("\nAdding Magazines: ");
        library.addMagazine(m1);
        library.addMagazine(m2);
        System.out.println();
        library.displayMagazines();
        System.out.println("\nRemoving a magazine");
        library.removeMagazine(m2.itemId);
        System.out.println();
        library.displayMagazines();

        // Borrowing items
        System.out.println("\nBorrowing items: ");
        s1.borrow(b1);
        p1.borrow(m1);
        System.out.println();

        // Printing borrowed item details
        System.out.println("Printing details of borrowed item by student1: ");
        s1.showBorrowedItem();
        System.out.println();
        System.out.println("Printing details of borrowed item by professor1: ");
        p1.showBorrowedItem();

        // Printing Book & Author Details
        System.out.println("\nPrinting the details of book1:");
        b1.showDetails();

        // Returning items
        System.out.println("\nReturning the book and magazine: ");
        s1.returnItem(b1);
        p1.returnItem(m1);
    }
}
