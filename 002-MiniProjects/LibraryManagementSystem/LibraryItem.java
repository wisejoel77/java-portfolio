package com.wisejoel77.LibraryManagementSystem;

public class LibraryItem {
    // Fields
    protected String itemId;
    protected  String title;
    protected boolean isAvailable;

    // Constructors
    public LibraryItem(String itemId, String title){
        this(itemId, title, false);
    }

    public LibraryItem(String itemId, String title, boolean isAvailable){
        setItemId(itemId);
        setTitle(title);
        setIsAvailable(isAvailable);
    }

    // Getter Methods
    public String getItemId(){
        return itemId;
    }

    public String getTitle(){
        return title;
    }

    public boolean getIsAvailable(){
        return isAvailable;
    }

    // Setter Methods
    protected void setItemId(String itemId){
        if(itemId == null || itemId.isBlank()){
            System.out.println("ItemID cannot be null or blank");
        } else {
            this.itemId = itemId;
        }
    }

    protected void setTitle(String title){
        if(title == null || title.isBlank()){
            System.out.println("Title cannot be null or blank");
        } else {
            this.title = title;
        }
    }

    protected void setIsAvailable(boolean isAvailable){
        this.isAvailable = isAvailable;
    }

    // Utility Methods
    protected void borrowItem(){
        if(getIsAvailable()){
            System.out.println(title + " is borrowed successfully");
            isAvailable = false;
        } else {
            System.out.println(title + " is not available");
        }
    }

    protected void returnItem(LibraryItem item){
        if(!getIsAvailable()){
            isAvailable = true;
            System.out.println(title + " is returned successfully.");
        } else {
            System.out.println(title + " is not borrowed.");
        }
    }

    protected void showDetails(){
        System.out.println("##### ITEM DETAILS #####");
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Available: " + isAvailable);
    }
}
