package Ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex09 {

    public static void main(String[] args) {

//        ArrayList<String> id_pw = new ArrayList<>();
//
//        id_pw.add("sang");
//        id_pw.add("1234");
        String[] id_pw = {"sang","12345"};
        String[][] str = {{"sang", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}};

        for (int i = 0; i < str.length; i++) {
            if (id_pw[0].equals(str[i][0]) && id_pw[1].equals(str[i][1])) {
                System.out.println("login");
                break;
            } else if (id_pw[0].equals(str[i][0])) {
                System.out.println("wrong pw");
                break;
            }else {
                System.out.println("fail");
            }
        }




    }
}
