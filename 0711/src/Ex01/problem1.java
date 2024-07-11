package Ex01;

import java.util.Scanner;

public class problem1 {

    public static void main(String[] args) {

        int[] arr = new int[10];
        int[] arr2 = new int[10];
        Scanner sc = new Scanner(System.in);
        int pos = 0;
        int rev_pos = 9;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2 != 0) {
                arr2[pos] = arr[i];
                pos++;
            }else {
                arr2[rev_pos] = arr[i];
                rev_pos--;
            }


        }for (int i = 0; i<arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

    }
}
