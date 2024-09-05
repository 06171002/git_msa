package org.lsj;

import org.lsj.components.CC;

public class Ex02 {


    public static void main(String[] args) {


        CC cc = CC.getInstance();
        CC cc1 = CC.getInstance();
        CC cc2 = CC.getInstance();
        CC cc3 = new CC();

        System.out.println(cc);
        System.out.println(cc1);
        System.out.println(cc3);

    }
}
