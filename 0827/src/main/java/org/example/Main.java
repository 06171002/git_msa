package org.example;

import java.util.Arrays;
import java.util.stream.IntStream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2 ==1 ) {
                System.out.println(arr[i]);
                sum += arr[i];
            }
        }
        System.out.println(sum);

        int result = Arrays.stream(arr)
                        .filter(n->n%2==0)
                                .sum();
        System.out.println(result);

    }
}