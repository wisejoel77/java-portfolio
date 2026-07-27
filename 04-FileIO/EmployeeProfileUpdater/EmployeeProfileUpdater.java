package com.wisejoel77.FileIO.EmployeeProfileUpdater;

import java.io.*;

public class EmployeeProfileUpdater {
    public static void main(String[] args){
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("src\\com\\wisejoel77\\FileIO\\EmployeeProfileUpdater\\employee_profile.txt"));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src\\com\\wisejoel77\\FileIO\\EmployeeProfileUpdater\\employee_profile_updated.txt"))) {
            String line;
            while((line = bufferedReader.readLine()) != null){
                bufferedWriter.write(line);
                bufferedWriter.write("\n");
            }
            System.out.println("Profile updated successfully");
        } catch (IOException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Program finished");
        }
    }
}
