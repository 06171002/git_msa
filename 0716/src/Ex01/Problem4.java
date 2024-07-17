package Ex01;

import java.util.Arrays;
import java.util.Scanner;

public class Problem4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String my_string = sc.nextLine();
        String overwrite_string = sc.nextLine();
        int idx = sc.nextInt();
        char[] cha1 = my_string.toCharArray();
        char[] cha = overwrite_string.toCharArray();

        System.arraycopy(cha,0,cha1,idx,overwrite_string.length());

        String str = new String(cha1);

        System.out.println(str);

    }
}
