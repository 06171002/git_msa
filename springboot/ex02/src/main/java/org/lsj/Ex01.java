package org.lsj;

import org.lsj.components.AA;
import org.lsj.conf.MyConf2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Ex01 {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConf2.class);

        Arrays.stream(applicationContext.getBeanDefinitionNames())
                .forEach(System.out::println);

        AA aa = applicationContext.getBean(AA.class);
    }
}