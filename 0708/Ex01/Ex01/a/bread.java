package Ex01.a;

public class bread {


    public static void main(String[] args) {

        int bread = 0;


        int[] result = {0,0,0};

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 5; k++) {
                  int sum = 500*i + 700*j + 400*k;
                  if(sum == 1900) {
                      System.out.println("빵 :" +(i+1) +"개" + " 아이스크림 :"  + (j+1) +"개" + " 과자 :" + (k+1) +"개");

                  }
                }
            }
        }
        System.out.println();


    }
}
