package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] keyinput = new String[5];
        int[] board = new int[2];
        int[] result = new int[2];

        int left = 0;
        int right = 0;
        int up = 0;
        int down = 0;

        for (int i = 0; i < keyinput.length; i++) {
            keyinput[i] = sc.nextLine();
        }
        for (int i = 0; i < board.length; i++) {
            board[i] = sc.nextInt();
        }

        for (int i = 0; i < keyinput.length; i++) {
            if (keyinput[i].equals("left")){
                left -= 1;
            } else if (keyinput[i].equals("right")) {
                right += 1;
            } else if (keyinput[i].equals("up")) {
                up += 1;
            } else if (keyinput[i].equals("down")) {
                down -= 1;
            }
        }
        int sum1 = right + left;
        int sum2 = up + down;
        result[0] = board[0] + sum1;
        result[1] = board[1] + sum2;

        System.out.println(Arrays.toString(result));
    }
}
