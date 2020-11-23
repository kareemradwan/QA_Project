package com.kradwan.qa;

import com.kradwan.qa.manger.PrinterManager;
import com.kradwan.qa.model.PrintRequest;
import com.kradwan.qa.model.Printer;
import com.kradwan.qa.model.WebPrinter;
import com.kradwan.qa.model.WifiPrinter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {


    public static void main(String[] args) {


        if (PrinterManager.getInstance().getPrinters().size() < PrinterManager.NUM_PRINTERS) {
            Boolean canAddPrinter = true;
            while (canAddPrinter) {
                Printer webPrinter = new WebPrinter("WebPrinter " + new Random().nextInt(10), true, 10);
                canAddPrinter = PrinterManager.getInstance().addPrinter(webPrinter);
            }
        }

        ArrayList<PrintRequest> requests = new ArrayList<>();
        if (requests.size() == 0) {

            for (PrintRequest request : requests) {
                for (Printer printer : PrinterManager.getInstance().getPrinters()) {

                    if (printer.getNumOfPapers() > 0) {
                        Boolean status = PrinterManager.getInstance().print(request);
                        if (!status) {
                            // TODO Save Faild Reques
                            PrinterManager.getInstance().saveFailedRequest(request);
                        }
                    } else {
                        continue;
                    }
                }
            }

        }


    }


}
