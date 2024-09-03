package org.example;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex02 {

    public static void main(String[] args) {

        Path path = Paths.get("d:/a/obj");

        System.out.println(path);
        System.out.println(path.getRoot());
        System.out.println(path.getParent());
        System.out.println(path.getFileName());
    }
}
