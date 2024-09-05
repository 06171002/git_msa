package org.lsj.conf;

import org.lsj.components.AA;
import org.lsj.components.BB;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConf {

    @Bean
    public AA aa(){
        return new AA();
    }

    @Bean
    public BB bb(){
        return new BB();
    }

}
