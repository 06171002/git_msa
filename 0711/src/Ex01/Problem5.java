package Ex01;


//오름차순 버블
public class Problem5 {
    public static void main(String[] args) {

        int[] arr = {42, 1, 34, 2};
        int tmp = 0;


        for (int i = 3; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j+1]) {
                    tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;

                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }


}
