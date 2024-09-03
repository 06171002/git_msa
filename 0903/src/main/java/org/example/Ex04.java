package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;

public class Ex04 {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("d:/a/b/mytest");

        if (!Files.exists(path)) {
            Files.createFile(path);
        }

        byte[] buf = {0x15,0x16,0x17};
        System.out.println(Arrays.toString(buf));

        Files.write(path,buf, StandardOpenOption.APPEND);

        byte[] buf2 = Files.readAllBytes(path);
        System.out.println(Arrays.toString(buf2));

    }
}
