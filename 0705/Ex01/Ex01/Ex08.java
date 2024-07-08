package Ex01;

public class Ex08 {

    public static void main(String[] args) {

        for (int i = 1; i < 10; i++){
            doA();

        }





//        System.out.println((int) doA());


    }

    private static double doA() {
        int a = (int) (Math.random()*6 + 1);
        System.out.println(a);
        return a;
    }


}
