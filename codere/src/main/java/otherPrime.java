import java.util.Arrays;

public class otherPrime {

    public static void main(String[] args) {
        boolean[] arr = new boolean[100];
        Arrays.fill(arr,true);

        sieveOfEratosthenes(arr);



    }

    private static void sieveOfEratosthenes(boolean[] arr) {
        int count = 0;
        int sum = 0;
        for (int i = 2; i < arr.length ; i++) {
            if (arr[i] == true) {
                count++;
                sum += i;
                System.out.print(i + " ");
                for (int j = 2*i; j < arr.length; j+=i) {
                    arr[j] = false;
                }
            }

        }
        System.out.println();
        System.out.println(count);
        System.out.println(sum);
    }
}
