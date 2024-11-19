package com.green.userservice.user.vo;

import com.green.userservice.user.jpa.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserResponse {

    private String email;
    private String name;

    public static UserResponse from(UserEntity entity){
        return new UserResponse(entity.getEmail(), entity.getName());
    }
}
