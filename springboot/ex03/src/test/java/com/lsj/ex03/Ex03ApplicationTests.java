package com.lsj.ex03;

import com.lsj.ex03.user.User;
import com.lsj.ex03.user.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class Ex03ApplicationTests {

	@Autowired
	UserRepository userRepository;

	@Test
	void contextLoads() {
		System.out.println("run");

		User user = User.builder()
				.name("홍길동")
				.age(20)
				.email("asdf")
				.password("1234")
				.createDate(LocalDateTime.now())
				.build();
		userRepository.save(user);
	}

	@Test
	void selectTest() {
		userRepository.findAll()
				.stream()
				.forEach(System.out::println);
	}


}
