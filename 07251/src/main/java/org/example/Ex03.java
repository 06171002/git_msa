package org.example;

import java.util.Arrays;

public class Ex03 {

    public static void main(String[] args) {

        int[] num = {1,2,3,4,5};

        int[] copynum = Arrays.copyOf(num,2);
        int[] copynum1 = Arrays.copyOfRange(num,1,3);

        System.out.println(Arrays.toString(copynum));
        System.out.println(Arrays.toString(copynum1));
    }
}
