package org.example;

public class Dbox <A,B>{

    private A a;
    private B b;

    @Override
    public String toString() {
        return "Dbox{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }
}
