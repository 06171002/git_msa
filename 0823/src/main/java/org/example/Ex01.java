package org.example;

interface Printable {
    void print();
}

class Papers {
    private String con;

    public Papers(String con) {
        this.con = con;
    }

//    public Printable getprint() {
//        class Printer implements Printable {
//            @Override
//            public void print() {
//                System.out.println(con);
//            }
//        }
//        return new Printer();
//    }

    public Printable getprint() {
        return new Printable() {
            @Override
            public void print() {
                System.out.println(con);
            }
        };
    }

}
public class Ex01 {

    public static void main(String[] args) {

        Papers papers = new Papers("출력할 내용");
        Printable printable = papers.getprint();
        printable.print();
    }
}