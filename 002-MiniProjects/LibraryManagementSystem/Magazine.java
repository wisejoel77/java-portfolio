package com.wisejoel77.LibraryManagementSystem;

public class Magazine extends LibraryItem{
    // Fields
    private int issueNumber;

    // Constructors
    public Magazine(String itemId, String title, boolean isAvailable, int issueNumber){
        super(itemId,title,isAvailable);
        setIssueNumber(issueNumber);
    }

    // Getter Methods
    public int getIssueNumber(){
        return issueNumber;
    }

    // Setter Methods
    public void setIssueNumber(int issueNumber){
        this.issueNumber = issueNumber;
    }

    // Utility Methods
    @Override
    public void showDetails(){
        super.showDetails();
        System.out.println("Issue number: " + issueNumber);
    }
}
