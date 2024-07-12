package Ex01;

/**
 * 기본 생성자는 생략가능 하지만 다른 생성자를 선언할 시 기본생성자 생략 불가
 */
public class Box {

    String  name;
    int count;

    public Box() {

    }
    public Box (String  n) {
        name = n;
    }
    public Box (String n, int a) {

        name = n;
        count = a;

    }

    public String toString() {
        return "name = " +name + count;
    }

}
