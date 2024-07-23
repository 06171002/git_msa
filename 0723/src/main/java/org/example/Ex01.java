package org.example;

import org.example.inter.CMYKPrintable;
import org.example.inter.Printable;
import org.example.print.CMYKPrinter;

public class Ex01 {

    public static void main(String[] args) {

        System.out.println(Printable.HEIGHT);
        System.out.println(CMYKPrintable.WIDTH);

        CMYKPrintable prn = new CMYKPrinter();
        prn.print("옛날 프린터기");
        prn.printCMYK("내문서");

        prn.clean();

        Printable.printLine();


    }

}
