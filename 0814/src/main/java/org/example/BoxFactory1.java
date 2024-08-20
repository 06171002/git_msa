package org.example;

public class BoxFactory1 {

    public static <T> void peekBox(Box<T> box) {
        System.out.println(box);
    }

    public static void peekBox2(Box<? extends Number> box) {
        System.out.println(box);
    }

    public static void peekBox3(Box<? extends AA> box) {
        System.out.println(box);
    }

    public static void peekBox4(Box<? super BB> box) {
        System.out.println(box);
    }

    public static void peekBox5(Box<? extends AA> box) {
        AA getbox = box.get();
        System.out.println(getbox);
//        box.set(new AA());
    }

    public static void peekBox6(Box<? super AA> box) {
//        AA getbox = box.get();
//        System.out.println(getbox);
        box.set(new AA());

    }

    public static <T> T getMyBox(Box<? extends T> box) {
        return box.get();
    }
}
