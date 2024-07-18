package org.example;

import org.example.aa.BizMan;

public class Ex02 {

    public static void main(String[] args) {
        BizMan bm = new BizMan("선생님");
        BizMan bm1 = new BizMan("그린컴퓨터","선생님");
        BizMan bm2 = new BizMan("홍길동","그린컴퓨터","선생님");
        bm.showInfo();
        bm1.showInfo();
        bm2.showInfo();




    }


}
