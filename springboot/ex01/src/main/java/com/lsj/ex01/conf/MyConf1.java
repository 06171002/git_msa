package com.lsj.ex01.conf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.lsj.ex01.domain")
@ComponentScan(basePackages = "com.lsj.ex01.repository")
public class MyConf1 {



}
