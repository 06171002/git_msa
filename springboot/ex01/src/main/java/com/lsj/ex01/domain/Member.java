package com.lsj.ex01.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@Builder
@Component
public class Member {

    private int id;
    private String name;
    private int age;
    private String email;
    private String password;
    private LocalDate regdate;
    private LocalDateTime mydate;

    public Member() {
    }

    public Member(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
}
