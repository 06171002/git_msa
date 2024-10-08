package com.lsj.ex10.user;

import com.lsj.ex10.freeboard.FreeBoard;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


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
    @Email
    private String email;
    @Column(length = 100)
    private String password;

    private LocalDateTime Date;

    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    @Builder.Default
    private List<FreeBoard> list;

    // JPA CLASS -> talbe CREATE가 됩니다.

}
