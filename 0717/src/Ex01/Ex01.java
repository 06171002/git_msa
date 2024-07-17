package Ex01;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        String str = Integer.toString(num);
        char c = str.charAt(0);
        int first = c -'0';

        System.out.println(first);



        while (true) {

            sum += num/10;
            num = num/10;

            if (num <10){
                break;
            }


        }
        sum += first;
        System.out.println(sum);
    }

}
