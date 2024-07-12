package Ex01;

import java.util.Arrays;

public class Ex06 {

    public static void main(String[] args) {

        int[] ar = new int[5];

        Arrays.fill(ar, 3);

        System.out.println(ar[0]);

        Arrays.fill(ar, 0, 2,10);
        System.out.println(ar[0]);
    }
}
