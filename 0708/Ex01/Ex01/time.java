package Ex01;

import java.util.Scanner;

public class time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int b = (int) a / 3600;
        int c = (int) ((a % 3600) / 60);
        int d = (int) ((a % 3600) % 60);


        System.out.println(b + "시" + c + "분" + d + "초");
    }



}
