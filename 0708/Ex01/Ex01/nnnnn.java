package Ex01;

import java.util.Scanner;

public class nnnnn {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        System.out.println(doA(a));

    }

    public static int doA(int n){
        if (n == 1) {
            return 2;
        } else {
            return 2 * doA(n-1);

        }
    }
}
