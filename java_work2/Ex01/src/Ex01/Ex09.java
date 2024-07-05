package Ex01;

public class Ex09 {
    public static void main(String[] args) {
        int sum = 1;
        int[] arr = new int[10];
        arr[0] = 1;
        for (int i = 1; i<=9; i++){
            arr[i] = arr[i-1] + i + 1;
            sum = sum + arr[i];
        }

        System.out.println(arr[9]);
        System.out.println(sum);

////        int sum = 0;
//        for(int i = 1; i <= 3; i++) {
//
//            for(int j = 1; j <= i; j++) {
////                sum = sum + j;
//                System.out.print(j);
//            }
//            System.out.println();
//            System.out.println(sum);

//        int i = 1;



//        while (i<=10){
//
//            int j = 1;
//            while (j<=i) {
//                System.out.print(j);
//
//                j++;
//
//
//
//
//            }
//            System.out.println();
//            i++;

        }


    }



