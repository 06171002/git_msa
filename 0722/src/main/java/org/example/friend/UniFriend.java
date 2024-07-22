package org.example.friend;

import lombok.ToString;


public class UniFriend extends Friend {


    private String major;

    public UniFriend(String name, String phone, String major) {
        super(name, phone);
        this.major = major;
    }

    public void showInfo(){
        super.showInfo();
        System.out.println("전공 = " +major);
    }

    @Override
    public String toString() {
        return "UniFriend{" +
                "major='" + major + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
