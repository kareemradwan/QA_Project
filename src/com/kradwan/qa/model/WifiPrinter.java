package com.kradwan.qa.model;

public class WifiPrinter extends Printer {

    public WifiPrinter(String title, boolean enable, int numOfPapers) {
        super(title, enable, numOfPapers);
    }

    @Override
    public void printTitle(String title) {
        throw new NullPointerException("Not Implemented");
    }

    @Override
    public void printKeyValue(String key, String value) {
        throw new NullPointerException("Not Implemented");

    }

    @Override
    public void printImage(String url) {

        throw new NullPointerException("Not Implemented");
    }

    @Override
    public void printEmptyLine() {

        throw new NullPointerException("Not Implemented");
    }

    @Override
    public void printEmptyLine(int count) {

        throw new NullPointerException("Not Implemented");
    }
}
