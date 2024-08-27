package org.example;

import java.util.Arrays;
import java.util.List;

public class Ex05 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("AA","CCCC","BBB","DDDDD");

       String result = list.stream()
                .reduce("EEEEEE",
                        (a,b) ->{
                            if (a.length() > b.length()) return a;
                            else return b;
                            }
                );

        System.out.println(result);

        // 중간 연산 map,filter,sorted
        // 최종 연산 sum,foreach,reduce

        result = list.stream()
                .sorted()
                .reduce("",(a,b) ->a+b);
        System.out.println(result);
    }
}
