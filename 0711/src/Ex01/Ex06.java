package Ex01;

class Box {
    String conts;


    /**
     *  알트 인서트 생성자 만들기
     *
     */
    public Box(String conts) {
        this.conts = conts;
    }



    //    Box(String conts)
}




public class Ex06 {

    public static void main(String[] args) {

        Box[] boxs = new Box[5];

        System.out.println(boxs[0]);
        System.out.println(boxs[1]);
        System.out.println(boxs[2]);
        System.out.println(boxs[3]);
    }
}
