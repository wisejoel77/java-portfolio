package com.wisejoel77.FileIO.EmployeeArchiveViewer;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class EmployeeArchiveViewer {
    public static void main(String[] args){
        try (FileInputStream fileInputStream = new FileInputStream("src\\com\\wisejoel77\\FileIO\\EmployeeArchiveViewer\\file.txt");
             BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream)){
            int data;
            System.out.println("Employee Archive Contents: ");
            while ((data = bufferedInputStream.read()) != -1){
                System.out.print((char) data);
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Program finished");
        }
    }
}
