package org.example;

public class Ex02 {

    public static void main(String[] args) {

        Dbox<String,Integer> box = new Dbox();
        Dbox box1 = new Dbox();

        box.setA("홍길동");
        box.setB(20);

        System.out.println(box);

        Object obj = "string";
        String str = (String) obj;
    }
}
