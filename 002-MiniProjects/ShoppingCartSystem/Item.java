package com.wisejoel77.ShoppingCartSystem;

public class Item {
    // Fields
    private String itemName;
    private int quantity;
    private double pricePerUnit;
    protected int cartQuantity = 0;

    // Constructors
    public Item(String itemName, int quantity, double pricePerUnit){
        setItemName(itemName);
        setQuantity(quantity);
        setPricePerUnit(pricePerUnit);
    }

    // Setter methods
    public void setItemName(String itemName){
        if(itemName == null || itemName.isBlank()){
            System.out.println("Item name cannot be null or blank");
        } else {
            this.itemName = itemName;
        }
    }

    public void setQuantity(int quantity){
        if(quantity < 0){
            System.out.println("Quantity cannot be negative");
        } else {
            this.quantity = quantity;
        }
    }

    public void setPricePerUnit(double pricePerUnit){
        if(pricePerUnit < 0){
            System.out.println("Price per unit cannot be negative");
        } else {
            this.pricePerUnit = pricePerUnit;
        }
    }

    // Getter methods
    public String getItemName(){
        return itemName;
    }

    public int getQuantity(){
        return quantity;
    }

    public double getPricePerUnit(){
        return pricePerUnit;
    }

    // Utility Methods
    public void updateItemPrice(double price){
        setPricePerUnit(price);
    }

    public void getItemDetails(){
        System.out.println("Item name: " + itemName + " | Available Quantity: " + quantity + " | Price per unit: " + pricePerUnit);
    }
}
