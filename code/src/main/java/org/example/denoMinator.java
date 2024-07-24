package org.example;

import java.util.Scanner;



    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int numer1 = sc.nextInt();
        int numer2 = sc.nextInt();
        int denom1 = sc.nextInt();
        int denom2 = sc.nextInt();

        int num1 = numer1*denom2 + numer2*denom1;
        int num2 = denom1*denom2;
        int answer = 0;
//        int grd = grd(num1,num2);
//        int result = (num1/grd) + (num2/grd);
//        System.out.println(result);

        for (int i = 1; i <=num1 && i<=num2 ; i++) {
            if (num1%i == 0 && num2%i == 0){
                answer = i;
            }
        }
        System.out.println(answer);

        int result = (num1/answer) + (num2/answer);
        System.out.println(result);


    }
    public static int grd(int i, int j){
        if (i % j == 0){
            return j;
        }else {
            return grd(j,i%j);
        }
    }
}
