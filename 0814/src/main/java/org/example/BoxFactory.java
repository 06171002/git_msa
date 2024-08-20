package org.example;

public class BoxFactory {

    public static <T> Box<T> makeBox(T t){
        Box<T> box = new Box<>(t);
        box.set(t);
        return box;
    }
}
