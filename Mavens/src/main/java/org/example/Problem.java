package org.example;

import java.util.ArrayList;
import java.util.List;

public class Problem {

    public static void main(String[] args) {

        int[] arr = {45,456,22,122,23,67,322,676,33,10};
        System.out.println(minValue(arr));
        System.out.println(maxValue(arr));
    }

    public static int minValue(int[] arr) {
        int min_idx = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (arr[min_idx] > arr[j]) {
                    min_idx = j;
                }
            }
        }
        return arr[min_idx];

    }
    public static int maxValue(int[] arr) {
        int max_idx = 0;
        for (Integer e :arr){
            if (arr[max_idx] < e){
                arr[max_idx] = e;
            }
        }
        return arr[max_idx];
    }


}
