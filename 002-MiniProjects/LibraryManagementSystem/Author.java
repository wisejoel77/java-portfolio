package com.wisejoel77.LibraryManagementSystem;

public class Author {
    // Fields
    protected String authorName;
    protected String biography;
    protected int noOfBooksPublished;

    // Constructors
    public Author(String authorName, String biography, int noOfBooksPublished){
        setAuthorName(authorName);
        setBiography(biography);
        setNoOfBooksPublished(noOfBooksPublished);
    }

    // Setter Methods
    public void setAuthorName(String authorName){
        if(authorName == null || authorName.isBlank()){
            System.out.println("Name cannot be null or blank");
        } else {
            this.authorName = authorName;
        }
    }

    public void setBiography(String biography){
        if(biography == null || biography.isBlank()){
            System.out.println("Biography cannot be null or blank");
        } else {
            this.biography = biography;
        }
    }

    public void setNoOfBooksPublished(int noOfBooksPublished){
        if(noOfBooksPublished < 0){
            System.out.println("No.of books cannot be negative");
        } else {
            this.noOfBooksPublished = noOfBooksPublished;
        }
    }

    // Getter Methods
    public String getAuthorName(){
        return authorName;
    }

    public String getBiography(){
        return biography;
    }

    public int getNoOfBooksPublished(){
        return noOfBooksPublished;
    }

    // Utility Methods
    public void showAuthorDetails(){
        System.out.println("##### AUTHOR DETAILS #####");
        System.out.println("Author name: " + getAuthorName());
        System.out.println("Biography: " + getBiography());
        System.out.println("No.of books: " + getNoOfBooksPublished());
    }
}
