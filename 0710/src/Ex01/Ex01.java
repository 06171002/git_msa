package Ex01;

public class Ex01 {

    public static void fivonacci(int a) {

        int firstnum = 0;
        int secondnum = 1;
        int fivonacci = 0;

        System.out.println(firstnum);
        System.out.println(secondnum);

        for (int i =2; i < a; i++){
            fivonacci = firstnum + secondnum;
            System.out.println(fivonacci);
            firstnum = secondnum;
            secondnum = fivonacci;
        }
    }

    public static void main(String[] args) {
        System.out.println("fivonacci");
        int a = 10;
        fivonacci(a);
    }
}
