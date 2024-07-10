package rock;

import java.util.Scanner;

public class paper {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str;
        int user=0,computer;
        int[] result ={0,0};

        while (true){
            str = sc.next();
            computer = (int)(Math.random()*3);
            if (str.equals("가위")){
                user = 0;
            } else if (str.equals("바위")) {
                user = 1;
            } else if (str.equals("보")) {
                user = 2;

            }

            if (user == computer){
                result[1] +=1;
            } else if (user == 0 && computer ==2 || user == 1 && computer == 0 || user == 2 && computer == 1) {
                result[0] +=1;
            }else {
                break;
            }

        }
        System.out.println(computer);
        System.out.println("승: " +result[0] + "무: " + result[1]);
    }
}
