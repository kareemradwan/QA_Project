package com.kradwan.qa;

import com.kradwan.qa.model.webPrinter;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<Printer> printers;

    public static void main(String[] args) {

        printers = new ArrayList<>();
        printers.add(new webPrinter("WebPrinter1", true, 10));
//        printers.add(new WifiPrinter("WifiPrinter", true, 10));

//
//        System.out.println("Welcome in Printers Panel:");
//        System.out.println("Enter Select Option: ");
//        System.out.println("1- print title");
//        System.out.println("2- print key value");

        printString("Hello From IUG");
        printString(null);

    }

    public static void printString(String title) {

        for (Printer printer : printers) {
            printer.printTitle(title);
        }
    }
}
