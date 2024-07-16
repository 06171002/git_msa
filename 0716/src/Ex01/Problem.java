package Ex01;

public class Problem {

    public static void main(String[] args) {
        String str = "Hello.java";

        System.out.print("파일명 ");
        for (int i = 0; i < 5; i++) {
            System.out.print(str.charAt(i));
        }
        System.out.println();

        System.out.print("확장자 ");
        for (int i = 6; i <10 ; i++) {
            System.out.print(str.charAt(i));
        }

    }
}
