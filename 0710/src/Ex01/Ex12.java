package Ex01;

import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        int j = sc.nextInt();

        System.out.println(i+ "과 " + j + "의 최대 공약수 = " +grd(i,j));

    }

    public static int grd(int i, int j) {
        if (i % j == 0) {
            return j;
        }else {
            return grd(j,i%j);
        }
    }
}
