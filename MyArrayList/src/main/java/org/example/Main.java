package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        MyArrayList<Integer> myArrayList = new MyArrayList<>();

        myArrayList.add(10);
        myArrayList.add(20);
        myArrayList.add(30);
        myArrayList.add(50);
        myArrayList.add(3,20);

        System.out.println(myArrayList);
        System.out.println(myArrayList.get(2));
        System.out.println(myArrayList.indexOf(20));

        myArrayList.remove(1);
        System.out.println(myArrayList);




    }
}