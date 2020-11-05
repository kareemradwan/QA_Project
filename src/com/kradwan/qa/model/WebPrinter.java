package com.kradwan.qa.model;

public class WebPrinter extends Printer {


    public WebPrinter(String title, boolean enable, int numOfPapers) {
        super(title, enable, numOfPapers);
    }

    @Override
    public void printTitle(String title) {

        if (title.length() == 0) {
            return;
        }

        System.out.println("PRINT TITLE: " + title);

    }

    @Override
    public void printKeyValue(String key, String value) {
//        String output = String.format("10%s10%s", key, value);
        String output = key + " : " + value;
        System.out.println("PRINT KeyValue: " + output);
    }

    @Override
    public void printImage(String url) {

        if (!(url.contains("http") || url.contains("https"))) {
            return;
        }
        System.out.println("PRINT IMAGE: " + url);
    }

    @Override
    public void printEmptyLine() {
        System.out.println("\n");
    }

    @Override
    public void printEmptyLine(int count) {

        if (count == 0) {
            return;
        }
        printEmptyLine(count--);
    }
}
