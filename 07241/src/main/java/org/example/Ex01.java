package org.example;

public class Ex01 {

    public static void md1(){
        md2(10,0);
    }
    private static void md2(int i, int j){
        System.out.println(i/j);
    }

    public static void main(String[] args) {
        md1();
    }
}
