package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class MyArrayListTest {

    public static void main(String[] args) {

        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(10);
        myArrayList.add(20);
        myArrayList.add(30);
        myArrayList.add(40);
        myArrayList.add(50);

        System.out.println(myArrayList.indexOf(30));
        System.out.println(myArrayList.get(0));

        System.out.println(myArrayList);

        myArrayList.add(60);
        System.out.println(myArrayList.size());


    }
}
