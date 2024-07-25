package org.example;

public class Main {
    public static void main(String[] args) {

            AAA AA1 = new AAA("AA");
            AAA AA2 = new AAA("AA");
            AAA AA3 = new AAA("AAA");

            AA1.printThis(AA2);

            System.out.println(AA1.equals(AA2));
            System.out.println(AA2.equals(AA1));
            System.out.println(AA3.equals(AA1));

            System.out.println(AA1 == AA2);


    }
}