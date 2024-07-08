package Ex01;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();
        int best = sc.nextInt();

        doA(test);
        doB(best);


    }

    public static void doA(int end){
        int sum = 0;
        for (int i = 1; i < end +1; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }

    public static void doB(int and){
        int sum = 1;
        for (int i = 1; i < and +1; i++){
            sum = sum * i;
        }
        System.out.println(sum);
    }
}
