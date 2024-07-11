package Ex01;

public class Ex07 {

    public static void main(String[] args) {


        String str = "안녕하세요 이상진 입니다";
        String[] tempstr = str.split(" ");
        for (int i = 0; i< tempstr.length; i++){
            System.out.println(tempstr[i]);
        }

        String a ="abcdefgh";
        System.out.println(a.length());
        System.out.println(a.charAt(0));
        System.out.println(a.charAt(1));
        System.out.println(a.charAt(2));
        System.out.println(a.charAt(3));

        System.out.println(a.substring(2));
        System.out.println(a.substring(2,5));




        System.out.println("배열출력시작");
        char[] test = a.toCharArray();
        for (int i = 0; i< test.length; i++){
            System.out.println(test[i]);
        }
        System.out.println("배열출력끝");

        int[] b =new int[3];

        System.out.println(b.length);


        /**
         *  String -> char[]
         *  char[] -> String
         *
         */
        String abc = "할수있다";
        char[] chars = abc.toCharArray();

        System.out.println(chars[0]);

        chars[2] = 'A';

        System.out.println(chars[2]);

        String aa = new String(chars);
        System.out.println(aa);



    }
}
