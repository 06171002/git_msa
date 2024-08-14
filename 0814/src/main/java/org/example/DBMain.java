package org.example;

import java.util.Scanner;

public class DBMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DBRepository dbRepository = new DBRepository();

        while (true){
            System.out.println("""
                    뭐할래?
                    1. 입력
                    2. 조회
                    3. 수정
                    4. 삭제
                    5. 종료
                    """);

            int cho = sc.nextInt();
            if(cho ==1){
                dbRepository.insert();
            } else if (cho ==2) {
               dbRepository.select();
            }else {
                System.out.println("종료됩니다.");
                break;
            }
        }
    }
}
