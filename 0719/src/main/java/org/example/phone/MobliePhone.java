package org.example.phone;

import lombok.ToString;

@ToString
public class MobliePhone {

    int number;

    public MobliePhone(int number) {
        this.number = number;
    }

//    public void show() {
//        System.out.println("number = " + number);
//    }

//    @Override
//    public String toString() {
//        return "MobliePhone{" +
//                "number=" + number +
//                '}';
//    }
}
