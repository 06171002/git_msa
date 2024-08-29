package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex01 {

    public static void main(String[] args) {

        Stream.of(11,22,33,44,55)
                .forEach(System.out::println);

        List<String> list = Arrays.asList("11","22","33","44");

    }
}
