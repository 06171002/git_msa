package org.example.phone;

import lombok.ToString;

@ToString(callSuper = true)
public class SmartPhone extends MobliePhone{

    private String androidVer;

    public SmartPhone(String aver,int number) {
        super(number);
        this.androidVer = aver;
    }

    public void show() {
        System.out.println("androidVer = " + androidVer);
        System.out.println("number = " + number);
    }

//    @Override
//    public String toString() {
//        return "SmartPhone{" +
//                "androidVer='" + androidVer + '\'' +
//                '}';
//    }

    //    @Override
//    public String toString() {
//        return "SmartPhone{" +
//                "androidVer='" + androidVer + '\'' +
//                ", number=" + number +
//                '}';
//    }
}
