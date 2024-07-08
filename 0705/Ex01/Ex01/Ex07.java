package Ex01;
// 두개의 주사위 눈의 합 6 모든 경우의 수 프로그램
public class Ex07 {

    public static void main(String[] args) {

        doA();
    }

    private static void doA() {
        for (int i = 1; i < 7; i++){
            for (int j = 1; j < 7; j++){
                if (i + j ==6){
                    System.out.println(i + " " + j);
                }

            }
        }
    }
}
