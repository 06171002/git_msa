package com.lsj.ex05.user;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;


@Entity
@Table(name = "users")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // AUTOINCREMENT 이거 설정해줘...
    private Long id;

    @Column(name = "username",nullable = false,length = 50)
    private String name;

    private int age;

    @Column(length = 100, unique = true)
    private String email;
    @Column(length = 100)
    private String password;

    private LocalDateTime Date;

    // JPA CLASS -> talbe CREATE가 됩니다.

}
