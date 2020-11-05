package com.kradwan.qa.model;

public abstract class Printer implements PrinterAction {

    private String title;
    private boolean enable = false;
    private int numOfPapers = 1;

    public Printer() {
    }

    public Printer(String title, boolean enable, int numOfPapers) {
        this.title = title;
        this.enable = enable;
        this.numOfPapers = numOfPapers;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public int getNumOfPapers() {
        return numOfPapers;
    }

    public void setNumOfPapers(int numOfPapers) {
        this.numOfPapers = numOfPapers;
    }
}
