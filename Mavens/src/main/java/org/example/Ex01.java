package org.example;

import org.example.aa.Box;

public class Ex01 {

    public Ex01() {
        Box box = new Box("마이박스");
        System.out.println(box);

        System.out.printf("%s\n","문자열 출력");

        int a = 10;
        int b = 20;
        System.out.printf("%d\n",a);
        System.out.printf("%f\n",(double)a);
        System.out.printf("%o\n",a);

        String str = String.format("%d + %d = %d",a,b,a+b);
        System.out.println(str);
    }

    public static void main(String[] args) {

        new Ex01();
    }
}
