package Ex01;

public class Ex01 {
    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i <= 10; i++){

            for (int j = 1; j <= i; j++){
                System.out.println("j = " +j);
                sum = sum + j;
            }
            System.out.println("sum = " + sum);
        }

        System.out.println(sum);

    }
}
