package org.example.inter;

public interface Printable {
    int HEIGHT = 70;
    int WIDTH = 120;

    public void print(String mydoc);

    default void clean(){
        System.out.println("청소기능 추가");
    }

    static void printLine(){
        System.out.println("한줄 출력할떄 줄바꿈");
    }

}
