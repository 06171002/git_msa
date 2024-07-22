package org.example;

import java.util.Arrays;

public class Rectangle {

    private int x;
    private int y;
    private int width;
    private int height;

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public int square(){
        int area = x*y*width*height;
        return area;
    }

    public void show(){
//        int[] dot = {x,y};
        System.out.println("(" + x + "," + y +")" +"에서 크기가" +width + "*" + height +"인 사각형");

    }
    boolean contanins(Rectangle r){
        if ((r.x + r.width) < (this.x + this.width) && (r.y + r.height) < (this.y + this.height) && (this.x < r.x) && (this.y < r.y)){
            return  true;
        }
        else {
            return false;
        }
    }
}
