package org.example;

import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);

        list.stream()
                .forEach(System.out::println);

        int result = list.stream()
                            .mapToInt(s->s)
                            .sum();

        System.out.println(result);

        int sum = list.stream()
                        .filter(s->s%2==0)
                        .reduce(0,(a,b) ->a+b);

        System.out.println(sum);

        int sum1 =list.stream()
                        .mapToInt(s -> s)
                        .filter(s -> s%2==0)
                        .sum();

    }
}