package org.example;

import java.util.Arrays;

public class Problem1 {

    public static void main(String[] args) {
        
        int[] rank = {3,7,2,5,4,6,1};
        String[] attend = {"false","true","true","true","true","false","false"};
        String[] str = new String[7];
        int first = 0;
        int second = 0;
        int third = 0;
        int max_idx = 0;

        for (int i = 0; i < rank.length; i++) {
            str[rank[i]-1] = attend[i];
        }
        for (int i = rank.length-1; i >=0; i++) {
            for (int j = 0; j < rank.length; j++) {
                if (rank[max_idx] < rank[j]){
                    max_idx = j;
                }
            }

        }
    }
}
