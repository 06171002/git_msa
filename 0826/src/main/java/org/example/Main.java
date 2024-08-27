package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("ROBOT", "BOX", "LAMDA","AA","기역");
        list = new ArrayList<>(list);

        System.out.println(list);

        Collections.sort(list,(a,b) -> a.length()-b.length());
        System.out.println(list);


    }
}