package com.lsj.ex07.freeboard;

import com.lsj.ex07.user.User;
import com.lsj.ex07.user.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


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
                .email("asdfaaaaaa")
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
    void select() {

        List<FreeBoard> list = freeBoardRepository.findAll();
        list.stream().forEach(System.out::println);
    }

    @Test
    void delete() {
        freeBoardRepository.deleteById(2L);
    }
}