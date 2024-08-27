package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class MyArrayList {

    private Object[] objects;
    final int CAPACITY = 5;
    private int SELECT_CAPACITY;
    private int size = 0;

    public MyArrayList() {
        this.objects = new Object[CAPACITY];
    }
    public MyArrayList(int SELECT_CAPACITY) {
        this.objects = new Object[SELECT_CAPACITY];
    }

    public void add(Object o) {
        this.objects[size] = o;
        size++;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOfRange(objects,0,size));
    }
}
