package org.example;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int newNum;
        int reNum;
        int tmp;
        int cnt = 1;

        newNum = (N/10) + (N%10);

        reNum = ((N%10)*10) + newNum%10;

        if (reNum == N) {
            System.out.println(cnt);
        }else {
            for (int i = 0; true; i++) {
                cnt++;
                tmp = reNum;
                newNum = (tmp/10) + (tmp%10);

                reNum = ((tmp%10)*10) + newNum%10;
                if (reNum == N){
                    break;
                } else {
                    continue;
                }

            }
            System.out.println(cnt);
        }

    }
}
