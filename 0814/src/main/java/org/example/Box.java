package org.example;

public class Box <T>{

    private T value;

    public T get() {
        return value;
    }

    public void set(T value) {
        this.value = value;
    }

    public Box(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Box{" +
                "value=" + value +
                '}';
    }
}
