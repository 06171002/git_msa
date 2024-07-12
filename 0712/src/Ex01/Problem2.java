package Ex01;

import java.util.ArrayList;
import java.util.Scanner;


/**
 * ArrayList 칸수 지정해주지 않아도 되는 배열
 */
public class Problem2 {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        while (num != 0) {
            arr.add(num%2);
            num = num/2;



        }
        for (int i = arr.size()-1; i >= 0; i--) {
            System.out.print(arr.get(i));
        }

    }
}
