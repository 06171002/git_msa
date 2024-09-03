package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Ex03 {

    public static void main(String[] args) throws IOException {
        Files.createFile(Paths.get("d:a/b/myfile"));

        Files.createFile(Paths.get("d:/a/없는폴더/myfile"));

        Files.createDirectories(Paths.get("d:/a/bbb"));

    }
}
