package com.wisejoel77.FileIO.EmployeeRecordViewer;

import java.io.IOException;
import java.io.RandomAccessFile;

public class EmployeeRecordNavigator {
    public static void main(String[] args){
        try (RandomAccessFile randomAccessFile = new RandomAccessFile("src\\com\\wisejoel77\\FileIO\\EmployeeRecordViewer\\file.txt", "rw")){
            System.out.println("Writing the text to the file...");
            randomAccessFile.writeBytes("Hello, I am Arnold Joel Joshua Matangi");
            System.out.println("The pointer is now at " + randomAccessFile.getFilePointer());
            System.out.println("Moving the pointer to the name position and printing the name from the file");
            System.out.print("Name: ");
            randomAccessFile.seek(12); // Hardcoded according to my text
            String name = randomAccessFile.readLine();
            System.out.println(name);
        } catch (IOException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Program finished");
        }
    }
}
