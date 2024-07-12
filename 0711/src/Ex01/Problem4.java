package Ex01;

public class Problem4 {

    //오름차순
    public static void main(String[] args) {

        int[] arr = {42, 100, 34, 2};

        int max_idx = 0;


        exd(arr, max_idx);


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
