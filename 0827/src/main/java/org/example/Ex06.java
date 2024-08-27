package org.example;


import java.util.ArrayList;
import java.util.List;

public class Ex06 {

    public static void main(String[] args) {

        MemberDBRepository memberDBRepository = new MemberDBRepository();

        List<Member> list = memberDBRepository.select();

        list.stream().forEach(s -> System.out.println(s));

//        list = new ArrayList<>(list);
//
//        System.out.println(list);
    }
}
