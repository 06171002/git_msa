package Ex01;

import java.util.Arrays;

public class Problem3 {

    //내림차순 버블
    public static void main(String[] args) {

        int[] arr = {42, 1, 34, 2};
        int tmp = 0;


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[j+1]) {
                    tmp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = tmp;

                }
            }
        }
//        for (int i = 0; i <arr.length; i++) {
//            System.out.println(arr[i]);
//        }
        System.out.println(Arrays.toString(arr));

    }
}
