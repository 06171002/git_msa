package org.example;

public class Point implements Cloneable {
    private int xpos;
    private int ypos;

    public Point(int xpos, int ypos) {
        this.xpos = xpos;
        this.ypos = ypos;
    }

    public void setXpos(int xpos) {
        this.xpos = xpos;
    }

    public void setYpos(int ypos) {
        this.ypos = ypos;
    }

    public void showPoint(){
        System.out.printf("[%d,%d]\n",xpos,ypos);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
