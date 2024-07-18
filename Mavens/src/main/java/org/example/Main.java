package org.example;

import org.example.aa.Student;

public class Main {
    public Main() {

        Student student = new Student("홍길동",90,80,60);

        System.out.println(student);
        System.out.println(student.gerAverage());
        System.out.println(student.getTotal());
    }

    public static void main(String[] args) {

        new Main();

    }
}