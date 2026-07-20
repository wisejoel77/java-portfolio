package com.wisejoel77.LibraryManagementSystem;

public class Library implements BookOperations, MagazineOperations{
    private Book[] books = new Book[10];
    private Magazine[] magazines = new Magazine[10];
    int bookCount = 0;
    int magazineCount = 0;

    // Overriding BookOperations
    @Override
    public void addBook(Book book){
        if(bookCount < books.length){
            books[bookCount++] = book;
            System.out.println(book.title + " has been added");
        } else {
            System.out.println("Library is full, You cannot add more books");
        }
    }

    @Override
    public void removeBook(String itemId){
        boolean isFound = false;
        for(int i=0; i<bookCount; i++){
            if(books[i].getItemId().equals(itemId)){
                books[i] = books[--bookCount];
                books[bookCount] = null; // Clearing the unused array slot (Still need to learn collections, that's why using this approach)
                System.out.println("Book has been removed");
                isFound = true;
                break;
            }
        }
        if(!isFound){
            System.out.println("Book not found");
        }
    }

    @Override
    public void displayBooks(){
        System.out.println("List of books in the library are: ");
        for(int i=0; i<bookCount; i++){
            books[i].showDetails();
        }
    }

    // Overriding MagazineOperations
    @Override
    public void addMagazine(Magazine magazine){
        if(magazineCount < magazines.length){
            magazines[magazineCount++] = magazine;
            System.out.println(magazine.title + " has been added successfully");
        } else {
            System.out.println("Library is full, you cannot add more magazines");
        }
    }

    @Override
    public void removeMagazine(String itemId){
        for(int i=0; i<magazineCount; i++){
            if(magazines[i].itemId.equals(itemId)){
                magazines[i] = magazines[--magazineCount];
                magazines[magazineCount] = null;
                System.out.println("Magazine removed successfully");
                return;
            }
        }
        System.out.println("Magazine not found");
    }

    @Override
    public void displayMagazines(){
        System.out.println("List of magazines in the library are: ");
        for(int i=0; i<magazineCount; i++){
            magazines[i].showDetails();
        }
    }
}
