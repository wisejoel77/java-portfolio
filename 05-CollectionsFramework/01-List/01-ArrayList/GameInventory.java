package com.wisejoel77.CollectionsFramework.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class GameInventory {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        // Taking inputs
        System.out.print("Enter the titles (Type 'none' to stop): ");
        String str;
        while(!(str = scanner.nextLine()).equalsIgnoreCase("none")){
            list.add(str);
        }

        // Printing output
        System.out.println("Printing all the titles using for loop:");
        System.out.print("Titles: ");
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println();

        // Adding a new game
        System.out.print("Enter a new title to add: ");
        str = scanner.nextLine();
        list.add(str);

        // Removing a game
        System.out.print("Enter a title to remove: ");
        str = scanner.nextLine();
        list.remove(str);

        // Checking if a game is available in the list or not
        System.out.print("Enter a title to check availability: ");
        str = scanner.nextLine();
        if(list.contains(str)){
            System.out.println(str + " is available");
        } else {
            System.out.println(str + " is not available");
        }

        System.out.println("Total number of titles: " + list.size());
        System.out.println("Titles: " + list);
        scanner.close();
    }
}

// Sample Input Example
/*
Fortnite
GTA VI
GTA V
Minecraft
none
Rocket League
Minecraft
Fortnite
 */
