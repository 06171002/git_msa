package org.example;

import java.util.Arrays;

public class Ex02 {

    public static void main(String[] args) {

        double[] doubles ={1.1,2.2,3.3,4.4,5.5};

        Arrays.stream(doubles,1,4)
                .forEach(s -> System.out.println(s));

        Arrays.stream(doubles,1,4)
                .forEach(System.out::println);
    }
}
