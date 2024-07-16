package Ex01;

import aa.CirCle;

public class Ex06 {

    public static void main(String[] args) {

        CirCle cir2 = new CirCle();
        CirCle cir = new CirCle();
        CirCle cir1 = new CirCle();
        cir.doA();

        cir2.doB();
        System.out.println(cir2.doB());
        System.out.println(CirCle.PI);

        cir1.doC();
        cir.doD();
        cir1.doE();


    }
}
