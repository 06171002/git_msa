package Ex01;

public class Ex07 {


    public static void main(String[] args) {


        doA();




//        int num = 0;
//        int sum = 0;
//        while (num<21){
//            if (num%2 != 0 && num%3 != 0) {
//                sum = sum + num;
//
//            }num++;
//        }
//        System.out.println(sum);

    }


    public static void doA () {
        int num = 0;
        for (int i = 1; i < 21; i++) {
            if (i % 2 != 0 && i % 3 != 0) {
                num += i;
            }
        }
        System.out.println(num);

    }

}

