package org.example;

import java.util.Scanner;

public class DBMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DBRepository dbRepository = new DBRepository();

        while (true) {
            System.out.println("""
                    what do you want?
                    1. insert
                    2. select
                    3. update
                    4. delete
                    5. end
                    """);
            int cho = sc.nextInt();
            if (cho == 1) {
                dbRepository.insert();
            }else {
                System.out.println("end");
                break;
            }

        }


    }
}
