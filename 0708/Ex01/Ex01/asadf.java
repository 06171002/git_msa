package Ex01;

public class asadf {
    public static void main(String[] args) {

        int a = 0;
        int b = 0;
        int c = 0;
        int total = 1200;
        int cnt = 0;
        recur(1200, 0, 0, 0, 0);

    }

    public static void recur(int total, int a, int b, int c) {
        if (total < 0) {
            return;
        } else if (total == 0) {
            System.out.println(a + " " + b + " " + c);
            return;
        }

        recur(total - 500, a + 1, b, c);
        recur(total - 700, a, b + 1, c);
        recur(total - 400, a, b, c + 1);

    }
}
