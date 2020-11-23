package com.kradwan.qa.manger;

import com.kradwan.qa.model.PrintRequest;
import com.kradwan.qa.model.Printer;
import com.kradwan.qa.model.PrinterAction;

import java.util.ArrayList;
import java.util.List;

public class PrinterManager implements PrinterAction {

    private static PrinterManager manager;

    private List<PrintRequest> mRequests;
    private List<Printer> mPrinters;

    public static final int NUM_PRINTERS = 3;


    private final int numOfAllowPrint = 3;
    private int currentIndex = 0;

    private PrinterManager() {
        mRequests = new ArrayList<>();
        mPrinters = new ArrayList<>();
    }

    public static PrinterManager getInstance() {
        if (manager == null) {
            manager = new PrinterManager();
        }
        return manager;
    }


    @Override
    public void printTitle(String title) {
        checkNum();

        synchronized (this.mPrinters) {
            for (Printer printer : mPrinters) {
                printer.printTitle(title);
            }
        }

    }

    @Override
    public void printKeyValue(String key, String value) {
        checkNum();
        synchronized (this.mPrinters) {
            for (Printer printer : mPrinters) {
                printer.printKeyValue(key, value);
            }
        }
    }

    @Override
    public void printImage(String url) {
        checkNum();
        synchronized (this.mPrinters) {
            for (Printer printer : mPrinters) {
                printer.printImage(url);
            }
        }
    }

    @Override
    public void printEmptyLine() {
        checkNum();

        synchronized (this.mPrinters) {
            for (Printer printer : mPrinters) {
                printer.printEmptyLine();
            }
        }
    }

    @Override
    public void printEmptyLine(int count) {

        checkNum();

        synchronized (this.mPrinters) {
            for (Printer printer : mPrinters) {
                printer.printEmptyLine(count);
            }
        }
    }

    private void checkNum() {
        if (currentIndex == numOfAllowPrint) {
            System.out.println("You Can't Print More Than: " + numOfAllowPrint);
            System.exit(0);
        }
        currentIndex++;
    }

    public boolean addPrinter(Printer printer) {
        if (this.mPrinters.size() == NUM_PRINTERS) {
            System.out.println("You can't add More than " + NUM_PRINTERS + " Printers");
            return false;
        }
        synchronized (this.mPrinters) {
            this.mPrinters.add(printer);
            return true;
        }
    }

    public void removePrinter(Printer printer) {
        synchronized (this.mPrinters) {
            this.mPrinters.remove(printer);
        }
    }

    public List<Printer> getPrinters() {
        return mPrinters;
    }


    public List<PrintRequest> getAllPrintRequesT() {
        return new ArrayList<>();
    }

    public boolean print(PrintRequest request) {
        return true;
    }

    public void saveFailedRequest(PrintRequest request){

    }


}
