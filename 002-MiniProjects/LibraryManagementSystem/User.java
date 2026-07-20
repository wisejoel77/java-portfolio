package com.wisejoel77.LibraryManagementSystem;

public class User {
    // Fields
    protected String userId;
    protected String name;
    protected int maxBorrowLimit;
    private LibraryItem borrowedItem;

    // Constructors
    public User(String userId, String name){
        setUserId(userId);
        setName(name);
        setMaxBorrowLimit();
        borrowedItem = null;
    }

    // Getter Methods
    public String getUserId(){
        return userId;
    }

    public String getName(){
        return name;
    }

    public int getMaxBorrowLimit(){
        return maxBorrowLimit;
    }

    // Setter Methods
    public void setUserId(String userId){
        if(userId == null || userId.isBlank()){
            System.out.println("User ID cannot be null or blank");
        } else {
            this.userId = userId;
        }
    }

    public void setName(String name){
        if(name == null || name.isBlank()){
            System.out.println("Name cannot be null or blank");
        } else {
            this.name = name;
        }
    }

    public void setMaxBorrowLimit(){
        maxBorrowLimit = 1;
    }

    // Utility Methods
    public void borrow(LibraryItem item){
        if(borrowedItem != null){
            System.out.println(name + " has already borrowed an item. Please return it first");
        } else if (item.getIsAvailable()){
            borrowedItem = item;
            item.borrowItem();
        }
    }

    public void returnItem(LibraryItem item){
        if(borrowedItem == null){
            System.out.println(name + " did not borrowed any item.");
        } else {
            item.returnItem(item);
            borrowedItem = null;
        }
    }

    public void showBorrowedItem(){
        if(borrowedItem == null){
            System.out.println(name + " did not borrow any item");
        } else {
            borrowedItem.showDetails();
        }
    }
}
