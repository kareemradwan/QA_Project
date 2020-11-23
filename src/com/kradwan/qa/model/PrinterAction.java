package com.kradwan.qa.model;

public interface PrinterAction {

    void printTitle(String title);

    void printKeyValue(String key, String value);

    void printImage(String url);

    void printEmptyLine();

    void printEmptyLine(int count);
}
