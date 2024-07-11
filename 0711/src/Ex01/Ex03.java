package Ex01;


import java.util.Scanner;

class Fact {
    public int fact(int num) {
        System.out.println("여기오나");
        if (num > 0) {
            return 2*fact(num -1);
        }else {
            return 1;
        }
//        fact();
    }
}


public class Ex03 {

    /**
     * scan.nextLine 문자열 입력
     * scan.nextInt 숫자 입력
     * int -> String 10+"";
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("몇승 구할래?");

        String a = sc.nextLine();
        int num = Integer.parseInt(a);

//        System.out.println(a);
//        System.out.println(num);

        Fact fact = new Fact();
        int result = fact.fact(num);
        System.out.println("result =" +result);

    }
}
