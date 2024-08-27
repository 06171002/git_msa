package org.example;

import java.util.Arrays;

public class Ex01 {

    public static void main(String[] args) {

        String[] arr = {"YOON","PARK","ROBOT"};

         int sum = Arrays.stream(arr)
                 .mapToInt(s -> s.length())
                 .sum();


        System.out.println(sum);
    }
}
