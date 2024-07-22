package org.example;


public class Ex03 implements Printable {

    @Override
    public void print(String doc) {
        System.out.println("프린트 됨");
    }

    @Override
    public void doA() {

    }

    public static void main(String[] args) {
        Printable printable =new Ex03();


        printable.doA();

        Printable p1 = new Printable() {
            @Override
            public void print(String doc) {
                System.out.println("새로운 프린터");
            }

            @Override
            public void doA() {

            }
        };

    }
}
