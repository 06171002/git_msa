package org.example;

public class Problem {

    public static int minValue(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }

    public static int maxValue(int[] arr) {
        int max = arr[0];
        for (int temp:arr) {
            if (max < temp) {
                max = temp;
            }
        }
        return max;

    }

    public static void main(String[] args) {
        int[] arr = {10,20,5,9,35,100};


    }
}
