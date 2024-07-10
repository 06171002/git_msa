package Ex01;

import java.util.Scanner;

public class Ex07 {

    public int doA(){
        System.out.println("초입력: ");
        Scanner sc = new Scanner(System.in);
        int result = sc.nextInt();
        return result;
    }

    public String time(int second) {
        int hour = second / 3600;
        int min = (second%3600)/60;
        int sec = (second%3600)%60;
        return hour +"시간" + min +"분" + sec +"초";

    }
}
