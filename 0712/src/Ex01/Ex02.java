package Ex01;

public class Ex02 {

    public static void main(String[] args) {

        Box[] boxes = new Box[3];

        System.out.println(boxes[0]);
        System.out.println(boxes[1]);
        System.out.println(boxes[2]);

        boxes[0] = new Box();
        System.out.println(boxes[0]);
    }
}
