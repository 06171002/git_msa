package org.example;

import java.util.Arrays;

public class Problem2 {

    public static void main(String[] args) {

        int[][] arr = {{1,2,5,6},{3,4,7,8},{5,6,9,3}};
        addTwoDArr(arr,5);
        System.out.println(Arrays.deepToString(arr));
    }
    public static void addOneDArr(int[] arr,int add) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += add;
        }
    }

    public static void addTwoDArr(int[][] array,int add){

        for (int i = 0; i < array.length; i++) {
            addOneDArr(array[i],add);
        }

    }
}
