package org.example;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@Builder
public class Member {

    private int id;
    private String name;
    private int age;
    private String email;
    private String password;
    private LocalDate regdate;
    private LocalDateTime mydate;

}
