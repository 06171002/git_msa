package org.example;

import java.util.Arrays;

public class Ex04 {

    public static void main(String[] args) {
        showAll("test");
        showAll("test","aaa");
        showAll("test","aaa","bbb");
    }


    public static void showAll(String ...args) {

        System.out.println(Arrays.toString(args));
    }
}
