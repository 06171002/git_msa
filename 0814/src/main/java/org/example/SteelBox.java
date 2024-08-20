package org.example;

public class SteelBox<T> extends Box<T>{

    private T t;

    public SteelBox(T value) {
        super(value);
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
