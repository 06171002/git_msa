package org.example;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        Box<Apple> box1 = new Box();
        Box<Orange> box2 = new Box();

        Box<String> box3 = new Box();
        Box<String> box5 = new Box();
        box5.setObj("string");
        String str = box5.getObj();
        System.out.println(str);

        Box<Scanner> box4 = new Box();

        box1.setObj(new Apple("apple"));
        box2.setObj(new Orange());

        box3.setObj("watermelon");

        Apple apple = box1.getObj();
        Orange orange = box2.getObj();


        System.out.println(box3.getObj());
        System.out.println(apple);
    }
}
