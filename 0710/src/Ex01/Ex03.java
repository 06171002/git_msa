package Ex01;

public class Ex03 {
    public static void main(String[] args) {
        int first = 1;
        int second = 1;
        int next = 0;

        for (int i = 0; i < 10; i++) {
            next = first + second;

            System.out.println(first);
            System.out.println(second);

            first = second;
            second = next;
            System.out.println(first);
            System.out.println(second);
            System.out.println(next);
        }

    }


}
