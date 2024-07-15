package Ex01;

import java.util.Scanner;

public class Problem3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String answer = "";



        for (int i = str.length() -1; i >= 0; i--) {
            answer += str.charAt(i);
        }
        System.out.println(answer);
    }
}
