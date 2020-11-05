package com.kradwan.qa;

import com.kradwan.qa.model.Printer;
import com.kradwan.qa.model.WebPrinter;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<Printer> sPrinters;

    public static void main(String[] args) {

        sPrinters = new ArrayList<>();
        sPrinters.add(new WebPrinter("WebPrinter1", true, 10));
//        sPrinters.add(new WifiPrinter("WifiPrinter", true, 10));

//
//        System.out.println("Welcome in Printers Panel:");
//        System.out.println("Enter Select Option: ");
//        System.out.println("1- print title");
//        System.out.println("2- print key value");

        printString("Hello From IUG");
        printString(null);


    }

    public static void printString(String title) {

        for (Printer printer : sPrinters) {
            printer.printTitle(title);
        }
    }
}
