package com.lsj.ex10;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.lang.reflect.Array;
import java.util.Arrays;

@SpringBootApplication
@EnableJpaAuditing
public class Ex10Application {

	public static void main(String[] args) {
		SpringApplication.run(Ex10Application.class, args);

	}

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}


}
