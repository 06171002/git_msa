package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private int value;

    public Main(){}

    public static void main(String[] args) {
        Main main = new Main();

        System.out.println(main.value);

        int newValue = main.value++;
        int newValue2 = newValue++;
        int newValue3 = newValue2++;

        System.out.println(newValue);
        System.out.println(newValue2);
        System.out.println(newValue3);




    }
}