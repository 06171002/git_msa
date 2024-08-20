package org.example;

public class Ex01 {

    public static void main(String[] args) {

        BoxFactory1.peekBox3(new Box<>(new AA()));
        BoxFactory1.peekBox3(new Box<>(new BB()));
        BoxFactory1.peekBox3(new Box<>(new CC()));

        BoxFactory1.peekBox4(new Box<AA>(new CC()));
    }
}
