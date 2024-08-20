package org.example;

import java.util.ArrayList;
import java.util.List;

public class Ex01 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Toy");
        list.add("Robot");
        list.add("Box");

        System.out.println(list);

        Person p1 = new Person("홍길동",20);
        Person p2 = new Person("김길동",30);

        System.out.println(p1);

        List<Person> plist = new ArrayList<>();
        plist.add(p1);
        plist.add(p2);

        System.out.println(plist);

    }
}
