package com.wisejoel77.LibraryManagementSystem;

public class Book extends LibraryItem{
    // Fields
    private final Author author;

    // Constructors
    public Book(String itemId, String title, boolean isAvailable, String authorName, String biography, int noOfBooksPublished){
        super(itemId,title,isAvailable);
        author = new Author(authorName, biography, noOfBooksPublished);
    }

    // Getter Methods
    public String getAuthor(){
        return author.authorName;
    }

    // Setter Methods


    // Utility Methods
    @Override
    public void showDetails(){
        super.showDetails();
        author.showAuthorDetails();
    }
}
