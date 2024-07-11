package Ex01;

import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        int[] max = new int[4];
        int num = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {

            if (num < arr[i]) {
                num = arr[i];
            }
        }

    }
}
