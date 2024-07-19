package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Problem1 {

    public static void main(String[] args) {
        
        int[] rank = {3,7,2,5,4,6,1};
        String[] attend = {"false","true","true","true","true","false","false"};
        String[] str = new String[7];
        ArrayList<Integer> last = new ArrayList<>();
        int[] num_idx = new int[7];



        for (int i = 0; i < num_idx.length; i++) {
            int num = 1;
            for (int j = 0; j < rank.length ; j++) {
                if (rank[j] ==num){
                    num_idx[i] =j;
                }
            }
        }
        System.out.println(Arrays.toString(num_idx));


        for (int i = 0; i < rank.length; i++) {
            str[rank[i]-1] = attend[i];
        }

        for (int i = rank.length-1; i >=0; i--) {
            int max_idx = 0;
            int tmp = 0;
            for (int j = 0; j <= i; j++) {
                if (rank[max_idx] < rank[j]){
                    max_idx = j;
                }
            }
            tmp = rank[i];
            rank[i] = rank[max_idx];
            rank[max_idx] = tmp;
        }
        int count = 0;
        for (int i = 0; i < str.length; i++) {

            if (str[i].equals("true")) {
                last.add(i);
                count++;
            }
            if(count == 3) {
                break;
            }

        }
        int a = last.get(0);
        int b = last.get(1);
        int c = last.get(2);
        int result = 10000*a + 100*b + c;
        System.out.println(last);
        System.out.println(Arrays.toString(rank));
        System.out.println(Arrays.toString(str));
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(result);

    }
}
