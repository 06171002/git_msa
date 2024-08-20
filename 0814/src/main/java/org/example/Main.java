package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Box<String> stringBox = BoxFactory.makeBox("abc");
        String str = stringBox.get();
        System.out.println("str = " + str);

        Box<Boolean> booleanBox = BoxFactory.makeBox(true);
        Boolean bool = booleanBox.get();
        System.out.println("bool = " + bool);

        Box<Integer> integerBox = BoxFactory.makeBox(100);
        Integer integer = integerBox.get();
        System.out.println("integer = " + integer);

        Dog dog = new Dog();
        Dog dog2 = new Dog();
        dog2.setName("보리");
        dog2.setSize(10);

        Box<Dog> dogBox = BoxFactory.makeBox(dog);
        Dog dog1 = dogBox.get();
        System.out.println("dog1 = " + dog1);

        dogBox = BoxFactory.makeBox(dog2);
        dog1 = dogBox.get();
        System.out.println("dog1 = " + dog1);


    }
}