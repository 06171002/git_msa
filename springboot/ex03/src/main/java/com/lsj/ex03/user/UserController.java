package com.lsj.ex03.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController // url 맵하는 클래스
@RequestMapping("user") // 주소줄에 user로 시작
@RequiredArgsConstructor
@CrossOrigin
public class UserController {

    private final UserRepository userRepository;

    @GetMapping("select")
    public List<User> select() {
        return userRepository.findAll();
    }

    @PostMapping("insert")
    public String insert(@RequestBody User user) {
        System.out.println("run");

//        User user = User.builder()
//                .name("홍길동")
//                .age(20)
//                .email("asdf")
//                .password("1234")
//                .createDate(LocalDateTime.now())
//                .build();
        userRepository.save(user);
        return "ok";
    }
}
