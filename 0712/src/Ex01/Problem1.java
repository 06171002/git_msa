package Ex01;

import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) {

//        String str = "12345";
//        int sum =0;
//
//        for (int i = 0; i < 5; i++) {
//            sum = sum + (str.charAt(i) - '0');
//        }
//        System.out.println(sum);

        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();

        asdf(str1);


//        for (int i = 0; i < 5; i++) {
//            sum =
//        }
//
//        char[] chr =str.toCharArray();
//
//        for (int i = 0; i <chr.length; i++) {
//            sum = chr[i];
//        }
//        System.out.println(sum);
    }

    private static void asdf(String str1) {
        int sum1 = 0;
        for (int i = 0; i < str1.length(); i++) {
            sum1 = sum1 + (str1.charAt(i) - '0');
        }
        System.out.println(sum1);
    }
}
