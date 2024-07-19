package org.example;

import org.example.box.Box;
import org.example.box.GoldPaperBox;
import org.example.box.PaperBox;

public class Ex04 {

    public static void main(String[] args) {

        Box box = new Box();
        PaperBox box1 = new PaperBox();
        GoldPaperBox box2 = new GoldPaperBox();

        wrapBox(box);
        wrapBox(box1);
        wrapBox(box2);

    }

    public static void wrapBox(Box box) {

        if (box instanceof GoldPaperBox) {
            ((GoldPaperBox) box).goldpaperbox();
        } else if (box instanceof PaperBox) {
            ((PaperBox) box).paperbox();
        } else {
            box.box();
        }

    }
}
