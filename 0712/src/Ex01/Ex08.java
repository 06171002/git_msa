package Ex01;

import java.util.Arrays;

public class Ex08 {

    public static void main(String[] args) {

        String[] str = {"aa", "bb", "cc"};
        for (String eo: str) {
            System.out.println(eo);
        }

        int[] ar ={1,2,3,4,5};
        int[] br =new int[10];

        System.arraycopy(ar,1,br,2,4);
        System.out.println(Arrays.toString(ar));
        System.out.println(Arrays.toString(br));

        for (int e: ar) {
            System.out.println(e);
        }
    }
}
