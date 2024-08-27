package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex04 {

    public static void main(String[] args) {

        List<Member> members = Arrays.asList(
                new Member(1,"홍길동",20,"email","password"),
                new Member(2,"김길동",30,"email","password"),
                new Member(3,"이길동",40,"email","password")

        );

        members.stream()
                .filter(m->m.getAge()>=30)
                .forEach(member -> System.out.println(member));
    }
}
