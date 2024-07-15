package Ex01;

public class asdf {
    public static void main(String[] args) {
        int[] answer = {1,4,4,3,1,4,4,2,1,3,2,8};

        for (int i = 1; i < 9; i++) {
            String str = "";
            for (int j = 0; j < answer.length; j++) {
                if (i == answer[j]) {
                    str+="*";
                }
            }
            System.out.println(i+str);
        }
    }
}
