package Ex01;

public class Ex05 {

    Ex05() {
        int[] ar = {10, 20, 30, 40, 50};
        doA(ar);
    }

    public void doA(int[] aa) {
        int sum = 0;
        for (int i = 0; i < aa.length; i++) {
            sum = sum + aa[i];
        }
        System.out.println(sum);
    }


    public static void main(String[] args) {

        Ex05 ex05 = new Ex05();
    }
}
