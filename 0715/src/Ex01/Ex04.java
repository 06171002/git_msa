package Ex01;


public class Ex04 {

    public static void main(String[] args) {

        Circle circle1 = new Circle(-1);
        Circle circle2 = new Circle();
        //반지름을 음수로 못넣게 막는 방법
        // 자바 만든사람이... 제임스 고슬링..
//        circle1.rad = -10;
//        circle2.rad = 20;

        circle2.setRad(4);
        circle2.getArea();





        System.out.println(circle2.getArea());

    }

}
