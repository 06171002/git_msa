package Ex01;

import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        if (n % 2 ==0){
            for (int i = 0; i <= n; i+=2) {
                result +=i*i;
            }
        }
        if (n % 2 !=0) {
            for (int i = 1; i <= n; i+=2) {
                result +=i;
            }
        }
        System.out.println(result);
    }
}
