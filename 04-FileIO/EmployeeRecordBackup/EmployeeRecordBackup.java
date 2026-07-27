package com.wisejoel77.FileIO.EmployeeRecordBackup;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class EmployeeRecordBackup {
    public static void main(String[] args){
        try (FileInputStream fileInputStream = new FileInputStream("src\\com\\wisejoel77\\FileIO\\EmployeeRecordBackup\\file.txt");
             FileOutputStream fileOutputStream = new FileOutputStream("src\\com\\wisejoel77\\FileIO\\EmployeeRecordBackup\\backupFile.txt")){
            int data;
            while((data = fileInputStream.read()) != -1){
                fileOutputStream.write(data);
            }
            System.out.println("Backup successful");
        } catch (IOException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Program finished");
        }
    }
}
