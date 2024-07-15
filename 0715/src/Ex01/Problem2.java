package Ex01;

import java.util.Arrays;

public class Problem2 {
    public static void main(String[] args) {

        int[] answer = {1,4,4,3,1,4,4,2,1,3,2};
        int[] num = {0,0,0,0,0};

        for (int i = 0; i < answer.length; i++) {
             num[answer[i]]++;

        }
        for (int i = 1; i<=4; i++) {
            System.out.print(i);
            for (int j = 0; j < num[i]; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
        System.out.println(Arrays.toString(num));


    }

}
