package Ex01;

import java.util.Arrays;
//정규표현식
public class Ex02 {

    public static void main(String[] args) {

        String str = "Hello.java";
        String[] temp = str.split("\\.");

        System.out.println(temp[0]);
        System.out.println(temp[1]);

        str = "Hello.Java";
        temp = str.split("[A-Z]");

        System.out.println(Arrays.toString(temp));

        str = "안녕하세요1 음..2특별히만들려고3하는건 없어요";
        temp = str.split("\\d");
        System.out.println(Arrays.toString(temp));

        str = "안녕하세요1 음..2특별히만들려고3하는건 없어요";
        temp = str.split("\\D");
        System.out.println(Arrays.toString(temp));

        str = "Hello.Java";
        temp = str.split("[a-z]");

        System.out.println(Arrays.toString(temp));
    }
}
