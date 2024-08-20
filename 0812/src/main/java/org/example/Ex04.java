package org.example;

import java.util.Arrays;

public class Ex04 {

    public static void main(String[] args) {

        int[] arr = {10,2,3,5,19,4};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        Person person = new Person();

        person.setAge(10);

        Person person1 = new Person("홍길동",20);
        person1.setAge(30);
        System.out.println(person1.getAge());
        person1.setName("가나다라");
        System.out.println();

    }
}
