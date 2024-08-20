package org.example;

public class Dog {

    private String name;
    private int size;

    public void setName(String name) {this.name = name;}

    public String getName() {return name;}

    public void setSize(int size) {this.size = size;}

    public int getSize() {return size;}

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}
