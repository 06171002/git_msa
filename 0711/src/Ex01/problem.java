package Ex01;

import java.util.Scanner;

public class problem {

    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i <a.length; i++) {
            a[i] = sc.nextInt();

            }

        extracted(a);
        System.out.println();
        extracted1(a);


    }

    private static void extracted1(int[] a) {
        System.out.println("짝수");
        for (int i = 0; i < a.length; i++) {
            if (a[i]%2 ==0) {
                System.out.print(a[i] + " ");
            }
        }
    }

    private static void extracted(int[] a) {
        System.out.println("홀수");
        for (int i = 0; i < a.length; i++) {
            if (a[i]%2 != 0) {
                System.out.print(a[i] + " ");
            }
        }
    }


}
