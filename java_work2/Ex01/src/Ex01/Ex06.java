package Ex01;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {

        //제어문 1번 입력 두에이 함수
        // 2번 두비 함수
        Scanner scan = new Scanner(System.in);
        int select = scan.nextInt();

        if (select == 1) {
            doA();
        }
        else if (select == 2) {
            doB();

        }
    }


    public static void doA(){
        System.out.println("doA 함수");
    }

    public static void doB(){
        System.out.println("doB 함수");
    }
}
