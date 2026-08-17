package com.wisejoel77.ShoppingCartSystem;

import java.util.LinkedList;
import java.util.ListIterator;

public class Cart {
    private double finalBill;
    LinkedList<Item> cart = new LinkedList<>();

    // Utility Methods
    public void addItem(Item item, int quantity){
        if(item.getQuantity() >= quantity){
            item.cartQuantity = quantity;
            cart.add(item);
        } else {
            System.out.println("Limited quantity available, unable to add requested number of items");
        }
    }

    public void removeItem(String itemName){
        ListIterator<Item> iterator = cart.listIterator();
        while(iterator.hasNext()){
            String name = iterator.next().getItemName();
            if(itemName.equals(name)){
                iterator.remove();
                System.out.println(name + " is removed from the cart");
                break;
            }
        }
    }

    public String getFirstAddedItem(){
        if(!cart.isEmpty()){
            return cart.getFirst().getItemName();
        }
        return null;
    }

    public String getLastAddedItem(){
        if(!cart.isEmpty()){
            return cart.getLast().getItemName();
        }
        return null;
    }

    public double getFinalBill(){
        finalBill = 0;
        for(Item item: cart){
            finalBill += item.getPricePerUnit() * item.cartQuantity;
        }
        return finalBill;
    }

    public void displayCart(){
        System.out.println("####### Cart Details #######");
        int count = 1;
        for(Item item: cart){
            System.out.println(count + "." + "Item name: " + item.getItemName() + " | Quantity: " + item.cartQuantity + " | Price per unit: " + item.getPricePerUnit() + " | Total cost: " + (item.getPricePerUnit() * item.cartQuantity));
            count++;
        }
        System.out.println("Overall bill: " + getFinalBill());
    }

    public void clearCart(){
        cart.clear();
        System.out.println("Cart has been cleared");
    }

    public void exit(){
        clearCart();
        System.out.println("Program terminated");
    }

    public void updateItemQuantity(Item item, int quantity){
        if(item.getQuantity() >= quantity){
            item.cartQuantity = quantity;
        } else {
            System.out.println("Limited quantity available, unable to update requested number of items");
        }
    }
}
