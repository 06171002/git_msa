package com.lsj.ex01.user;


import com.lsj.ex01.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;

import static com.lsj.ex01.repository.connection.DBConnectionUtil.forName;
import static com.lsj.ex01.repository.connection.DBConnectionUtil.getConnection;

@RestController
@CrossOrigin
//@RequiredArgsConstructor
public class UserController {

//    @Autowired
    private final MemberRepository memberRepository;

    @Autowired
    public UserController(MemberRepository memberRepository){
        this.memberRepository = memberRepository;
    }

    @GetMapping("member/insert")
    public String aa(@RequestParam(name = "name", defaultValue = "내이름") String name, @RequestParam( name = "age", defaultValue = "30") int age){
        System.out.println("name = " + name);
        System.out.println("age = " + age);
//        MemberRepository memberRepository = new MemberRepository();
        memberRepository.insert(name,age);
        return "aa";
    }
}
