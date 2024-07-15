package Ex01;

import java.util.Arrays;

public class Problem1 {

    public static void main(String[] args) {

        int[][] arr = new int[4][5];
        int sum = 0;


        Arrays.fill(arr[0],5);
        Arrays.fill(arr[1],10);
        Arrays.fill(arr[2],20);
        Arrays.fill(arr[3],30);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                sum = sum + arr[i][j];
            }
        }
        double aver =(double) sum/20;
        System.out.println(sum);
        System.out.println(aver);


    }
}
