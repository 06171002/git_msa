package Ex01;

public class Ex03 {

    public static void main(String[] args) {

        String a = "abcd";
        String b = "java";
        String c = "system";

        System.out.println(a.length());
        System.out.println(b.length());
        System.out.println(c.length());

        System.out.println(a.length() + b.length() + c.length());

        String str[] = new String[3];
        str[0] = a;
        str[1] = b;
        str[2] = c;

        int count = 0;


        for (int i = 0; i < str.length; i++) {
            count = count + str[i].length();
        }
        System.out.println(count);

    }
}
