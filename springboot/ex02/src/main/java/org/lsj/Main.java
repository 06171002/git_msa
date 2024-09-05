package org.lsj;


import org.lsj.components.AA;
import org.lsj.components.BB;
import org.lsj.conf.MyConf;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConf.class);

        Arrays.stream(applicationContext.getBeanDefinitionNames())
                .forEach(System.out::println);

        System.out.println(Arrays.toString(applicationContext.getBeanDefinitionNames()));


        AA aa1 = applicationContext.getBean(AA.class);
        AA aa2 = applicationContext.getBean(AA.class);

        BB bb = applicationContext.getBean(BB.class);

        System.out.println("aa1 = " + aa1);
        System.out.println("aa2 = " + aa2);

        aa1.setName("object what in spring ioc");

        System.out.println("aa1 = " + aa1);
        System.out.println("aa2 = " + aa2);




    }
}