package com.lsj.ex08.freeboard;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

@SpringBootTest
class Ex07ApplicationTests {

    @Test
    void contextLoads() {

        String[] str = {"10", "20", "30"};

        Arrays.stream(str).forEach(System.out::println);

        Arrays.stream(str).reduce("",(s,s2) -> s+s2);
    }


}
