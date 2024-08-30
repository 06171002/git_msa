package org.example;

import java.util.Arrays;

public class MyArrayList<T> {

    private Object[] element;
    private static final int DEFAULT_VALUE = 5;
    private int size = 0;

    public MyArrayList() {
        element = new Object[DEFAULT_VALUE];
    }

    public MyArrayList(int selet) {
        element = new Object[selet];
    }

    public int size() {
        return size;
    }

    public void add(T t) {
        if (size == element.length){
            grow();
        }
        element[size] = t;
        size++;
    }

    public void add(int index, T t) {
        if (index < 0 || element.length < index){
            throw new IndexOutOfBoundsException();
        } else if (element.length == index) {
            add(t);
        } else {
            if (size == element.length) {
                grow();
            }
            pushRight(index);
            element[index] = t;
            size++;
        }
    }

    private void pushRight(int index) {
        for (int i = size; i > index; i--) {
            element[i] = element[i-1];
        }
    }

    private void grow() {
        int oldCapacity = element.length;
        int newCapacity = oldCapacity * 2;
        element = Arrays.copyOf(element,newCapacity);
    }

    public T set(int index, T t) {
        if (index < 0 || element.length < index){
            throw new IndexOutOfBoundsException();
        } else if (element.length == index) {
            add(t);
            return null;
        } else {
            Object oldValue = element[index];//get(index);
            element[index] = t;
            return (T) oldValue;
        }
    }

    public T get(int index) {
        if (index < 0 || element.length <= index){
            throw new IndexOutOfBoundsException();
        } else {
            return (T) element[index];
        }
    }

    public int indexOf(T t) {
        for (int i = 0; i < size; i++) {
            if (element[i].equals(t)) {
                return i;
            }
        }
        return -1;
    }

    public T remove(int index) {
        if (index < 0 || element.length <= index){
            throw new IndexOutOfBoundsException();
        } else {
            Object oldValue = element[index];//get(index);
            pullLeft(index);
            size--;
            element[size] = null;
            return (T) oldValue;
        }
    }

    private void pullLeft(int index) {
        for (int i = index; i < size - 1; i++) {
            element[i] = element[i + 1];
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(element,size));
    }
}
