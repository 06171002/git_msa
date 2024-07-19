package org.example.aa;

import lombok.ToString;

@ToString
public class KiaCar extends Car{

    public void show(){
        System.out.println(name+ " " + desc + " " +company);
    }

    public KiaCar() {
    }

    public KiaCar(String name, String desc, String company) {
        this.name = name;
        this.desc = desc;
        this.company = company;

    }

//    @Override
//    public String toString() {
//        return "KiaCar{" +
//                "name='" + name + '\'' +
//                ", desc='" + desc + '\'' +
//                ", company='" + company + '\'' +
//                '}';
//    }
}
