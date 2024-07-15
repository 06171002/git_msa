package Ex01;

import java.util.Scanner;

/**
 * 클래스
 * 데이터(필드,클래스변수,인스턴스변수)
 * 메서드(함수,메서드함수,인스턴스함수)
 */
class Exam {
    Scanner sc = new Scanner(System.in);

    public int inputNumber() {
        System.out.println("숫자 입력");
        int inputNumber = sc.nextInt();
        System.out.println(inputNumber);
        return inputNumber;
    }
}




public class Problem4 {
    public static void main(String[] args) {

        Exam exam = new Exam();

        int result = exam.inputNumber();

        int 몫,나머지;
        몫 = result/2;
        나머지 = result%2;

        System.out.println("몫 = " +몫);
        System.out.println("나머지 = " +나머지);

        String 나머지들 = "" +나머지;
        while (true) {

            나머지 = 몫%2;
            몫 =  몫/2;
            나머지들 = 나머지 + 나머지들;

            System.out.println("몫 = " +몫);
            System.out.println("나머지 = " +나머지);
            System.out.println("나머지들 = " +나머지들);


            if (몫 < 2) {
                if(몫 !=0){
                    나머지들 = 몫 + 나머지들;
                    System.out.println("나머지들 = " +나머지들);
                }
                break;
            }

        }
    }
}
