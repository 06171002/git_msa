package org.example;

import org.example.phone.MobliePhone;
import org.example.phone.SmartPhone;

public class Ex01 {

    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("5.0", 12345);
        smartPhone.show();
        System.out.println(smartPhone.toString());

//        MobliePhone mobliePhone = new MobliePhone(45456);
//        mobliePhone.show();
//
//        MobliePhone mobliePhone1 = new SmartPhone("4.0",464345);
//        mobliePhone1.show();


    }
}
