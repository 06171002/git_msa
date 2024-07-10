package Ex01;

public class Ex02 {

    public static int fivonacci(int a) {

        if (a <=1) {
            return a;
        }else {
            return (fivonacci(a-2) + fivonacci(a-1));
        }
    }

    public static void main(String[] args) {
        System.out.println("fivonacci");
        int a = 10;
        for (int i = 0; i < a; i++) {
            System.out.println(fivonacci(i));
        }
    }
}
