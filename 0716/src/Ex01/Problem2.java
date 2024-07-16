package Ex01;

import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String my_string =sc.nextLine();
        String overwrite_string =sc.nextLine();
        int idx = sc.nextInt();
        char[] cha1 = my_string.toCharArray();
        char[] cha = overwrite_string.toCharArray();

        for (int i = 0; i <cha.length; i++) {
             cha1[i+idx] = cha[i];
        }
        System.out.println(cha1);
    }
}
