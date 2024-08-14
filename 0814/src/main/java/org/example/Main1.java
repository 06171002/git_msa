package org.example;

public class Main1 {

    public static void main(String[] args) {

        BoxFactory1.peekBox(new Box<>(10));
        BoxFactory1.peekBox2(new Box<>(20));

//        SteelBox<String> steelBox = new SteelBox<>();
//        steelBox.setT("test");
//
//        Box<String> box = new SteelBox<>();
//
//        System.out.println(steelBox.getT());
    }
}
