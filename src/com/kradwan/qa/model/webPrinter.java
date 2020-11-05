package com.kradwan.qa.model;

public class webPrinter {
    private String title;
    private boolean enable = false;
    private int numOfPapers = 1;

    public webPrinter() {
    }


    public webPrinter(String title, boolean enable, int numOfPapers) {
        this.title = title;
        this.enable = enable;
        this.numOfPapers = numOfPapers;
    }

    public void printTitle(String title) {

        if (title.length() == 0) {
            return;
        }

        System.out.println("PRINT TITLE: " + title);

    }

    public void printKeyValue(String key, String value) {

//        String output = String.format("10%s10%s", key, value);
        String output = key + " : " + value;

        System.out.println("PRINT KeyValue: " + output);
    }

    public void printImage(String url) {

        if (!(url.contains("http") || url.contains("https"))) {
            return;
        }
        System.out.println("PRINT IMAGE: " + url);
    }

    public void printEmptyLine() {
        System.out.println("\n");
    }

    public void printEmptyLine(int count) {

        if (count == 0) {
            return;
        }
        printEmptyLine(count--);
    }
}
