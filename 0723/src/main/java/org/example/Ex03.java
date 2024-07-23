package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("a : ");
            int a = sc.nextInt();
            System.out.println("b : ");
            int b = sc.nextInt();

            System.out.println("나누기 시작");
            System.out.println(a / b);
        } catch (ArithmeticException e){
//            System.out.println(e.getMessage());
            e.printStackTrace();
            System.out.println("0으로 나눌 수 없습니다.");
        }catch (InputMismatchException e){
            System.out.println("문자 입력");
        }
        catch (Exception p) {
            System.out.println("이것은 모든 예외상황");
        }

        System.out.println("정상 종료 되었습니다.");
    }
}
