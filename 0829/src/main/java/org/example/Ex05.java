package org.example;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex05 {

    public static void main(String[] args) {

        Stream<Person> person = Stream.of(new Person(100,90,80),
                new Person(90,80,70),
                new Person(60,70,80)
                );

        IntStream intStream = person.flatMapToInt(person1 -> IntStream.of(person1.getKor(),person1.getEng(),person1.getMath()));

        System.out.println(intStream.sum());

         person = Stream.of(new Person(100,90,80),
                new Person(90,80,70),
                new Person(60,70,80)
        );

        intStream = person.flatMapToInt(person1 -> IntStream.of(person1.getKor(),person1.getEng(),person1.getMath()));
        double avg = intStream.average().orElse(0);
        System.out.println(intStream.average());


    }
}
