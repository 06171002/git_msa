package com.green.userservice.user.vo;

import com.green.userservice.user.jpa.UserEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UserRequest {

    @Schema(hidden = true)
    private Long id;

    @NotBlank(message = "Email cannot be null")
    @Email
    @Schema(example = "aaa@naver.com")
    private String email;

    @Schema(hidden = true)
    private String userId;

    @Schema(example = "홍길동")
    private String name;

    @NotBlank(message = "Password cannot be null")
    @Size(min = 8, message = "Password must be greater than 8")
    @Schema(example = "abcd1234")
    private String password;

    private String thumbnail;

    public UserEntity toEntity() {
        return UserEntity.of(email, userId, name, password, thumbnail);
    }
}
