package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        char[][] chars = new char[N][M];

        for (int i = 0; i < N; i++) {
            String str = sc.next();
            chars[i] = str.toCharArray();
        }

        int[] arr = new int[M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (chars[i][j] == 'X') {
                    arr[j]++;
                }
            }
        }
        System.out.println(Arrays.toString(arr));





    }
}
