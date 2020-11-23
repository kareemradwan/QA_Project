package com.kradwan.qa.model;

import com.kradwan.qa.manger.PrintRequestType;

public class PrintRequest {


    private PrintRequestType type;

    private String key;
    private String value;

    public PrintRequest(String key, String value) {
        this.key = key;
        this.value = value;
    }
}
