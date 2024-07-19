package org.example;

import org.example.test.AA;
import org.example.test.BB;
import org.example.test.CC;

public class Ex02 {

    public static void main(String[] args) {

        AA a1 = new BB();
        AA a2 = new CC();

        a1.bb();
        a2.cc();

    }
}
