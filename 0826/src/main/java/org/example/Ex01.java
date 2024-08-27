package org.example;

interface Calculate {
    void cal(int a, int b);
}

interface RETCAL {
    int cal(int a, int b);
}

public class Ex01 {

    public static void main(String[] args) {

        RETCAL rc = (a,b) ->{
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            return a+b;
        };

       int result = rc.cal(10,20);

        System.out.println(result);




        Calculate c = new Calculate() {
            @Override
            public void cal(int a, int b) {
                System.out.println("계산");
            }
        };

        Calculate c2 = (int a, int b) -> {
            System.out.println("람다 계산");
        };

    }
}
