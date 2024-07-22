package org.example.friend;

import lombok.ToString;


public class ComFriend extends Friend {

    private String department;

    public ComFriend(String name, String phone, String department) {
        super(name,phone);
        this.department = department;
    }
    public void showInfo(){
        super.showInfo();
        System.out.println("부서 = " +department);
    }

    @Override
    public String toString() {
        return "ComFriend{" +
                "department='" + department + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
