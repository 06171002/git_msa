package org.example;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex06 {

    public static void main(String[] args) {

        Path path = Paths.get("cc");

        try(OutputStream outputStream = Files.newOutputStream(path)){
            outputStream.write(10);
            outputStream.write(65);

        } catch (Exception e) {
            e.printStackTrace();
        }

        try(OutputStream outputStream = new BufferedOutputStream (new FileOutputStream("aa"))){

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
