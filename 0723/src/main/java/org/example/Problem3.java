package org.example;

public class Problem3 {

    public static void main(String[] args) {

        int[] sides = {11,7};
        int max_idx = 0;
        int answer = 0;
        int sum = sides[0] + sides[1];

        if (sides[0]< sides[1]){
            max_idx = sides[1];
        }else {
            max_idx = sides[0];
        }
        if (max_idx == sides[1]){
            for (int i = (sides[1]- sides[0])+1; i <= sides[1]; i++) {
                answer++;
            }
        } else if (max_idx == sides[0]) {
            for (int i = (sides[0]- sides[1])+1; i <= sides[0]; i++) {
                answer++;
            }
        }

        for (int i = max_idx +1; i < sum; i++) {
            answer++;
        }
        System.out.println(answer);


    }
}
