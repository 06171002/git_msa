package org.example;

import org.example.inter.Printable;
import org.example.print.LGPrinter;

public class Main {
    public static void main(String[] args) {

        Printable printable = new LGPrinter();
        printable.print("LG");

    }
}