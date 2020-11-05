package com.kradwan.qa.model;

public class WifiPrinter {


    private String title;
    private boolean enable = false;
    private int numOfPapers = 1;

    public WifiPrinter() {
    }

    public WifiPrinter(String title, boolean enable, int numOfPapers) {
    }


    public void printTitle(String title) {
        throw new NullPointerException("Not Implemented");
    }

    public void printKeyValue(String key, String value) {
        throw new NullPointerException("Not Implemented");

    }

    public void printImage(String url) {

        throw new NullPointerException("Not Implemented");
    }

    public void printEmptyLine() {

        throw new NullPointerException("Not Implemented");
    }

    public void printEmptyLine(int count) {

        throw new NullPointerException("Not Implemented");
    }
}
