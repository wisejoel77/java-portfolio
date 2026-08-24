package com.wisejoel77.LambdaExpressions.TextReportFormatter;

public class ReportFormatter {

    String title;

    public ReportFormatter(String title){
        this.title = title;
    }

    String reportFormatter(){
        return title.toUpperCase();
    }
}
