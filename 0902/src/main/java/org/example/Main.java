package org.example;

import java.io.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {

        OutputStream os = new FileOutputStream("date.dat");
        os.write(3);
        os.close();

        InputStream is = new FileInputStream("date.dat");
        int dat = is.read();
        is.close();

        System.out.println(dat);
    }
}