package com.lsj.ex10.freeboard;

import com.lsj.ex10.user.User;
import com.lsj.ex10.user.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class FreeBoardRepositoryTest {

    @Autowired
    FreeBoardRepository freeBoardRepository;

    @Autowired
    UserRepository userRepository;

    @Test
    void insert() {
        User user = User.builder()
                .name("leeee")
                .age(20)
                .email("asdfaaaaaa@naver.com")
                .password("asdfaaaaa")
                .build();
//        userRepository.save(user);

        FreeBoard freeBoard = FreeBoard.builder()
                .title("title")
                .content("content")
                .user(user)
                .build();

        freeBoardRepository.save(freeBoard);
    }

    @Test
    void updateTest() {
        User user = User.builder()
                .id(1L)
                .name("leeee")
                .age(20)
                .email("asdfaaaaaa@naver.com")
                .password("asdfaaaaa")
                .build();
//        userRepository.save(user);

        FreeBoard freeBoard = FreeBoard.builder()
                .id(1L)
                .title("titleee")
                .content("contenttt")
                .user(user)
                .build();

        freeBoardRepository.save(freeBoard);

    }

    @Test
    void select() {

        List<FreeBoard> list = freeBoardRepository.findAll();
        list.stream().forEach(System.out::println);
    }

    @Test
    void delete() {
        freeBoardRepository.deleteById(2L);
    }
}