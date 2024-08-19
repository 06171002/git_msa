package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex03 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Toy","Box","Robot");

        list = new ArrayList<>(list);

        list.add("이거 안된다");
        System.out.println(list);
    }
}
