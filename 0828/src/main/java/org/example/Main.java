package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,5,7,9);
//        System.out.println(list);
        list = new ArrayList<>(list);

        Consumer<List<Integer>> consumer = mylist -> Collections.reverse(mylist);
        consumer.accept(list);


        System.out.println(list);


    }
}