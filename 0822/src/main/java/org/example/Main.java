package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();

        map.put(10,"홍길동");
        map.put(20,"박길동");
        map.put(30,"이길동");

        System.out.println(map);

        map.put(40,"최길동");
        System.out.println(map);
        map.put(50,"김길동");
        System.out.println(map);

        Set<Integer> set = map.keySet();
        System.out.println(set);


    }
}