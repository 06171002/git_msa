package org.example;

public class Ex04 {

    public static void main(String[] args) {

        String mydoc = "mydocument";
        Printable printable = new Sprint();
        printable.print(mydoc);

        Printable prn = new Lprint();
        prn.print(mydoc);
    }
}
