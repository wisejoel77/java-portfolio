package com.wisejoel77.CollectionsFramework.LinkedList;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class TrainRouteEditor {
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<>(List.of("Central Station", "Riverside", "Green Park", "City Center", "Airport Junction", "Tech Park", "East Terminal"));
        System.out.println("Original route: " + list);
        ListIterator<String> iterator = list.listIterator();
        while(iterator.hasNext()){
            String station = iterator.next();
            switch(station){
                case "Green Park" -> iterator.set("Lake Park");
                case "City Center" -> iterator.add("University");
                case "Airport Junction" -> iterator.remove();
                case "Tech Park" -> iterator.add("Industrial Area");
            }
        }

        iterator = list.listIterator(list.size());
        System.out.println("First station: " + list.getFirst());
        System.out.println("Last station: " + list.getLast());
        System.out.println("Number of stations in route: " + list.size());
        System.out.print("Route in reverse: ");
        while(iterator.hasPrevious()){
            System.out.print(iterator.previous() + ", ");
        }
        System.out.print("\b\b");
    }
}
