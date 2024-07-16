package aa;

public class CirCle {
    public static final double PI = 3.1415;
    public static int a =10;
    public void doA(){
        int a = 10;
    }

    public int doB(){
        int sum = 0;
        for (int i = 1; i < 10; i++) {
            sum +=i;
        }
        return sum;
    }

    public void doC() {
        int sum1 = 0;
        for (int i = 0; i < 10; i++) {
            sum1 += i;
        }
        System.out.println(sum1);
    }

    public void doD() {
        System.out.println(2*PI*a);
    }
    public void doE() {
        System.out.println(a*a*PI);
    }
}
