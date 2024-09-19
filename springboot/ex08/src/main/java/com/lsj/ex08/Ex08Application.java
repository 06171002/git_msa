package com.lsj.ex08;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Ex08Application {

	public static void main(String[] args) {
		SpringApplication.run(Ex08Application.class, args);
	}


}
