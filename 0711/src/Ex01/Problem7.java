package Ex01;

public class Problem7 {

    public static void main(String[] args) {

        int[] arr = {42, 100, 34, 2, 56};
        int tmp = 0;
        int min_idx = 4;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5  ; j++) {
                if (arr[min_idx] < arr[j]) {
                    min_idx = j;


                }

            }
            tmp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = tmp;
            System.out.println(arr[0]+" "+ arr[1]+" "+ arr[2]+" "+ arr[3] + " " + arr[4]);

        }



    }

    private static void exd(int[] arr, int max_idx) {
        for (int i = 3; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                if (arr[max_idx] < arr[j]) {
                    max_idx = j;


                }
            }
            swap(arr, i, max_idx);
            System.out.println(arr[0]+" "+ arr[1]+" "+ arr[2]+" "+ arr[3]);

        }
    }

    private static void swap(int[] arr, int i, int max_idx) {
        int tmp;
        tmp = arr[i];
        arr[i] = arr[max_idx];
        arr[max_idx] = tmp;
    }
}
