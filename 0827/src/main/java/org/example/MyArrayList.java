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
        if (size == objects.length){
            grow();
        }
        this.objects[size] = o;
        size++;
    }

    private void grow() {
        int oldValue = objects.length;
        int newValue = oldValue*2;
        objects = Arrays.copyOf(objects,newValue);
    }

    public int size() {
        return size;
    }

    public int indexOf(Object o) {
        for (int i = 0; i < objects.length; i++) {
            if (objects[i] == o) {
                return i;
            }
        }
        return -1;
    }

    public Object get(int n) {
        return objects[n];
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(objects,size));
    }
}
