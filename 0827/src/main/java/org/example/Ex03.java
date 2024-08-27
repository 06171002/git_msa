package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex03 {

    public static void main(String[] args) {

        String[] arr = {"AA","BB","CC"};
        List<String> list = Arrays.asList("ROBOT","TOY","AA");

        Stream<String> stream = Arrays.stream(arr);
        stream.forEach(s -> System.out.println(s));
    }
}
