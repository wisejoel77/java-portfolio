package com.wisejoel77.CollectionsFramework.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class PlaylistEditor {
    public static void main(String[] args){
        ArrayList<String> playlist = new ArrayList<>(List.of("Bohemian Rhapsody", "Billie Jean", "Smells Like Teen Spirit", "Like a Rolling Stone", "Respect"));
        ListIterator<String> iterator = playlist.listIterator();
        System.out.println("Playlist: " + playlist);
        // Adding "Blinding Lights" before "Billie Jean"
        while(iterator.hasNext()){
            if(iterator.next().equals("Billie Jean")){
                iterator.add("Blinding Lights");
            }
        }

        // Removing the song before "Respect"
        iterator = playlist.listIterator();
        while(iterator.hasNext()){
            if(iterator.next().equals("Respect")){
                iterator.previous();
                iterator.previous();
                iterator.remove();
                break;
            }
        }

        // Printing elements using list iterator from last
        iterator = playlist.listIterator(playlist.size());
        System.out.println("Playlist after modification in reverse: ");
        while(iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
    }
}
