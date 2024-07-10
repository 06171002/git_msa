package Ex01;

import java.util.Scanner;

public class Ex11 {

    public void goo() {


        Scanner sc = new Scanner(System.in);

        int c = sc.nextInt();

        for (int i = 2; i < 10; i++) {


            for (int j = 1; j < c; j++) {
                System.out.println(i + "*" + j + "=" + i * j);

            }
            System.out.println();
        }
    }
}
