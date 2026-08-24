package com.wisejoel77.LambdaExpressions.TextReportFormatter;

import java.util.Scanner;

public class TextReportFormatter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the title: ");
        String title = scanner.nextLine();
        ReportFormatter reportFormatter = new ReportFormatter(title);
        TextFormatter textFormatter = reportFormatter :: reportFormatter;
        System.out.print("Formatted title: " + textFormatter.formatString());
        scanner.close();
    }
}
