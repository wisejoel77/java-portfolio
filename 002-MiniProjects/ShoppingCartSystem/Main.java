package com.wisejoel77.ShoppingCartSystem;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Cart cart = new Cart();
        System.out.println("####### Shopping Cart System #######");

        // Creating inventory
        Item i1 = new Item("iPhone", 100, 999);
        Item i2 = new Item("iPad", 100, 599);
        Item i3 = new Item("Macbook", 100, 5999);
        Item i4 = new Item("AirPods", 100, 249);
        Item i5 = new Item("Adapter", 100, 19);
        Item i6 = new Item("Watch", 212, 150);
        Item i7 = new Item("Monitor", 29, 1200);

        while(true){
            System.out.println("\n1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Update Item Quantity");
            System.out.println("4. Update Item Price");
            System.out.println("5. View First and Last Added Item");
            System.out.println("6. Display Cart");
            System.out.println("7. Clear Cart");
            System.out.println("8. Exit");
            System.out.print("\nEnter your choice: ");
            int choice = scanner.nextInt();

            switch(choice){
                case 1:
                    System.out.println("\nInventory:");
                    i1.getItemDetails();
                    i2.getItemDetails();
                    i3.getItemDetails();
                    i4.getItemDetails();
                    i5.getItemDetails();
                    i6.getItemDetails();
                    i7.getItemDetails();
                    System.out.print("\nEnter item name: ");
                    String itemName = scanner.next();

                    Item item = null;
                    if(itemName.equalsIgnoreCase("iPhone")){
                        item = i1;
                    } else if(itemName.equalsIgnoreCase("iPad")){
                        item = i2;
                    } else if(itemName.equalsIgnoreCase("Macbook")){
                        item = i3;
                    } else if(itemName.equalsIgnoreCase("AirPods")){
                        item = i4;
                    } else if(itemName.equalsIgnoreCase("Adapter")){
                        item = i5;
                    } else if(itemName.equalsIgnoreCase("Watch")){
                        item = i6;
                    } else if(itemName.equalsIgnoreCase("Monitor")){
                        item = i7;
                    }
                    if(item != null){

                        System.out.print("Enter quantity: ");
                        int quantity = scanner.nextInt();

                        cart.addItem(item, quantity);
                    } else {
                        System.out.println("Item not found.");
                    }
                    break;
                case 2:
                    System.out.print("\nEnter item name to remove: ");
                    String removeItem = scanner.next();
                    cart.removeItem(removeItem);
                    break;
                case 3:
                    System.out.print("\nEnter item name: ");
                    String updateItem = scanner.next();

                    Item itemToUpdate = null;
                    if(updateItem.equalsIgnoreCase("iPhone")){
                        itemToUpdate = i1;
                    } else if(updateItem.equalsIgnoreCase("iPad")){
                        itemToUpdate = i2;
                    } else if(updateItem.equalsIgnoreCase("Macbook")){
                        itemToUpdate = i3;
                    } else if(updateItem.equalsIgnoreCase("AirPods")){
                        itemToUpdate = i4;
                    } else if(updateItem.equalsIgnoreCase("Adapter")){
                        itemToUpdate = i5;
                    } else if(updateItem.equalsIgnoreCase("Watch")){
                        itemToUpdate = i6;
                    } else if(updateItem.equalsIgnoreCase("Monitor")){
                        itemToUpdate = i7;
                    }
                    if(itemToUpdate != null){
                        System.out.print("Enter new quantity: ");
                        int quantity = scanner.nextInt();
                        cart.updateItemQuantity(itemToUpdate, quantity);
                    } else {
                        System.out.println("Item not found.");
                    }
                    break;
                case 4:
                    System.out.print("\nEnter item name: ");
                    String priceItem = scanner.next();

                    Item itemToUpdatePrice = null;

                    if(priceItem.equalsIgnoreCase("iPhone")){
                        itemToUpdatePrice = i1;
                    } else if(priceItem.equalsIgnoreCase("iPad")){
                        itemToUpdatePrice = i2;
                    } else if(priceItem.equalsIgnoreCase("Macbook")){
                        itemToUpdatePrice = i3;
                    } else if(priceItem.equalsIgnoreCase("AirPods")){
                        itemToUpdatePrice = i4;
                    } else if(priceItem.equalsIgnoreCase("Adapter")){
                        itemToUpdatePrice = i5;
                    } else if(priceItem.equalsIgnoreCase("Watch")){
                        itemToUpdatePrice = i6;
                    } else if(priceItem.equalsIgnoreCase("Monitor")){
                        itemToUpdatePrice = i7;
                    }

                    if(itemToUpdatePrice != null){

                        System.out.print("Enter new price: ");
                        double price = scanner.nextDouble();

                        itemToUpdatePrice.updateItemPrice(price);

                    } else {
                        System.out.println("Item not found.");
                    }
                    break;
                case 5:
                    System.out.println("\nFirst added item: " + cart.getFirstAddedItem());
                    System.out.println("Last added item: " + cart.getLastAddedItem());
                    break;
                case 6:
                    System.out.println();
                    cart.displayCart();
                    break;
                case 7:
                    cart.clearCart();
                    break;
                case 8:
                    cart.exit();
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
