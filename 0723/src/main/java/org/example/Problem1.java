package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Problem1 {

    public static void main(String[] args) {

        boolean[] arr = new boolean[100];
        Arrays.fill(arr,true);
        int count = 0;

        for (int i = 2; i < arr.length ; i++) {
            if (arr[i] == true) {
                count++;
                System.out.println(i);
                for (int j = 2*i; j < arr.length; j+=i) {
                    arr[j] = false;
                }
            }

        }
        System.out.println(count);


    }
}
