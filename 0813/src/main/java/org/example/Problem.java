package org.example;


class ABox<T extends Number> {
    private  T ob;

    public T getOb() {
        return ob;
    }

    public void setOb(T ob) {
        this.ob = ob;
    }
}
public class Problem {

    public static <T extends Number> void swapBox(ABox<T> t1,ABox<T> t2){

        T temp = t1.getOb();
        t1.setOb(t2.getOb());
        t2.setOb(temp);
    }
    public static <T extends ABox> void  swapBox1(T t1,T t2) {
        Number n = t1.getOb();
        t1.setOb(t2.getOb());
        t2.setOb(n);
    }

    public static void main(String[] args) {

        ABox<Integer> box1 = new ABox<>();
        box1.setOb(99);
        ABox<Integer> box2 = new ABox<>();
        box2.setOb(55);
        System.out.println(box1.getOb() + "&" + box2.getOb());
        swapBox(box1,box2);
        System.out.println(box1.getOb() + "&" + box2.getOb());
    }

}
