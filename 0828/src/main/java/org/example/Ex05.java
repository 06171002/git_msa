package org.example;

import java.util.Optional;

class ConstInfo{
    String phone;
    String address;

    public ConstInfo(String name, String address) {
        this.phone = name;
        this.address = address;
    }

    public String getPhone() {return phone;}

    public void setPhone(String name) {this.phone = name;}

    public String getAddress() {return address;}

    public void setAddress(String address) {this.address = address;}
}

public class Ex05 {

    public static void main(String[] args) {

        Optional<ConstInfo> constInfo = Optional.of(new ConstInfo(null,"KOREA DAEGU"));




        String phone = constInfo.map(s -> s.getPhone()).orElse("there is no phone number");
        String address = constInfo.map(n -> n.getAddress()).orElse("there is no address");

        System.out.println(phone);
        System.out.println(address);
    }
}
