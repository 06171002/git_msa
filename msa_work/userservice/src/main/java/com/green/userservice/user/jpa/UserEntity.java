package com.green.userservice.user.jpa;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "users")
public class UserEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false,length = 50)
    private String email;

    @Column(unique = true, nullable = false)
    private String userId;

    @Column(nullable = false, length = 50)
    private String name;

    @Column(nullable = false,length = 100)
    private String password;

    private String thumbnail;

    private UserEntity(String email, String userId, String name, String password, String thumbnail) {
        this.email = email;
        this.userId = userId;
        this.name = name;
        this.password = password;
        this.thumbnail = thumbnail;
    }

    public static UserEntity of(String email, String userId, String name, String password, String thumbnail) {
        return new UserEntity(email, userId, name, password, thumbnail);
    }
}
