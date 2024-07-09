package rock;

import java.util.Scanner;

public class aa {



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str;
        int user,computer;
        int[] result = {0,0};

        while (true) {

            computer = (int) (Math.random() * 3);
            str = sc.next();
            if (str.equals("가위")) {
                user = 0;
            } else if (str.equals("바위")) {
                user = 1;
            } else if (str.equals("보")) {
                user = 2;
            }else {
                System.out.println("값을 잘못 입력하셨습니다.");
                continue;
            }

            if (user == computer){
                result[1] += 1;

            } else if ((user == 0 && computer == 1) ||(user == 1 && computer == 2) || (user == 2 && computer == 0)){
                break;
            }else {
                result[0] += 1;

            }

        }
        System.out.println("승 =" +result[0] + "무 =" + result[1]);







    }


}
