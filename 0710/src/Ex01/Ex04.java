package Ex01;


public class Ex04 {

    public static void main(String[] args) {
        int[] fivonacci = new int[10];
        fivonacci[0] = 1;
        fivonacci[1] = 1;

        for (int i = 2; i < 10; i++) {
            fivonacci[i] = fivonacci[i-2] + fivonacci[i-1];

        }

        for (int j = 0; j < 10; j++) {
            System.out.print(fivonacci[j] + " ");
        }

    }


}
