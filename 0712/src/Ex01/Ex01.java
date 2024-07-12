package Ex01;



public class Ex01 {

    public static void main(String[] args) {

        Box abox = new Box("사과");
        Box bbox = new Box();
        Box cbox = new Box("바나나",10);

        System.out.println(abox);
        System.out.println(bbox);
        System.out.println(cbox);
    }
}
