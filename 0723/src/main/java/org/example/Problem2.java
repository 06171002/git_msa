package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 2; i <= num; i++) {
            for (int j = 2; j <= i; j++) {
                if (i !=j && i%j == 0){
                    break;
                }
                if (i == j){
                    arr.add(i);

                }
            }
        }
        System.out.println(arr);

    }
}
