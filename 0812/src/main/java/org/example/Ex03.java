package org.example;

import java.util.Arrays;

public class Ex03 {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};
        int[] arr1 = arr;

        System.arraycopy(arr,0,arr1,0,arr.length);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
        System.out.println(arr==arr1);

        if(arr == arr1){
            System.out.println("same");
        }
        if (Arrays.equals(arr,arr1)){
            System.out.println("Arrays.equals() 같다");
        }


    }
}
