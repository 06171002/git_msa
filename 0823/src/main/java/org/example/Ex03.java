package org.example;

interface AA {
    void doA();
    default void doB() {
        System.out.println("doB");
    }
    static void  doC() {
        System.out.println("doC");
    }
}

public class Ex03 {

    public static void  doMethod(AA aa) {
//        aa.doA();
        aa.doB();
    }


    public static void main(String[] args) {

        AA aa1 = new AA() {
            @Override
            public void doA() {
                System.out.println("interface");
            }
        };

//        aa1.doA();
//        aa1.doB();
//        AA.doC();
//
//
//        AA aa = () -> {
//            System.out.println("doA 메서드 재정의");
//        };
//
//        aa.doA();
//
//        doMethod( () -> {
//            System.out.println("new method definition");
//        } );

        doMethod(aa1);

//        AA aa2 = new AA() {
//            @Override
//            public void doA() {
//                System.out.println(10);
//            }
//        };
//        doMethod(aa2);

    }
}
