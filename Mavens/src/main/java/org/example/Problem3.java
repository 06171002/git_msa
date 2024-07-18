package org.example;

import java.util.Arrays;

public class Problem3 {

    public static void main(String[] args) {

        int[][] arr ={{1,2,3,4,5,6,7},{4,5,6,7,8,9,10},{7,8,9,10,11,12,13},{1,2,3,4,5,6,7},{6,7,8,9,10,11,12},{1,2,3,4,5,6,7}};
        int[][] arr1 =new int[arr.length][arr.length];

        for (int i = 0; i < arr.length; i++) {
            arr1[(i+1)%6] = arr[i];

        }
        System.out.print(Arrays.deepToString(arr1));

//        tmp = arr[0];
//        arr[0] = arr[2];
//        arr[2] = tmp;
//
//        tmp = arr[1];
//        arr[1] = arr[2];
//        arr[2] = tmp;




    }
}
