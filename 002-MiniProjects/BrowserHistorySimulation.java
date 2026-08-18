package com.wisejoel77.BrowserHistorySimulation;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class BrowserHistorySimulation {
    public static void main(String[] args){
        LinkedList<String> history = new LinkedList<>();
        ListIterator<String> iterator = history.listIterator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("===== Browser History Simulation =====");
        while(true){
            System.out.println("\nOperations:\n1. Visit a new page\n2. Go back\n3. Go forward\n4. Show current page\n5. Exit" );
            System.out.print("\nEnter your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch(choice){
                case 1 -> {
                    System.out.print("Enter page to visit: ");
                    String page = scanner.nextLine();
                    iterator.add(page);
                    while(iterator.hasNext()){
                        iterator.next();
                        iterator.remove();
                    }
                    System.out.println("Page visited!");
                    iterator.previous();
                    System.out.println("Current page: " + iterator.next());
                }
                case 2 -> {
                    if(history.isEmpty() || !iterator.hasPrevious() || history.size()==1){
                        System.out.println("Cannot go back: No previous pages!");
                    } else {
                        iterator.previous();
                        System.out.println("Went back to previous page!");
                        System.out.println("Current page: " + iterator.previous());
                        iterator.next();
                    }
                }
                case 3 -> {
                    if(history.isEmpty() || !iterator.hasNext()){
                        System.out.println("Cannot go forward: No forward pages!");
                    } else {
                        System.out.println("Moved to next page!");
                        System.out.println("Current page: " + iterator.next());
                    }
                }
                case 4 -> {
                    if(history.isEmpty()){
                        System.out.println("No pages visited yet!");
                    } else {
                        System.out.println("Current page: " + iterator.previous());
                        iterator.next();
                    }
                }
                case 5 -> {
                    System.out.print("Thank you for using my Browser History Simulator");
                    return;
                }
                default -> {
                    System.out.println("Invalid choice, please enter again.");
                }
            }
        }
    }
}
