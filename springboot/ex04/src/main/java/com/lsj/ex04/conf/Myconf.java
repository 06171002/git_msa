package com.lsj.ex04.conf;

import com.lsj.ex04.obj.AA;
import com.lsj.ex04.obj.BB;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.lsj.ex04.obj")
public class Myconf {

    @Bean
    public AA aa() {
        return new AA();
    }

//    @Bean
//    public BB bb() {
//        return new BB();
//    }
}
