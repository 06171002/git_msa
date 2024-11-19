package com.green.userservice.user.service;

import com.green.userservice.user.vo.UserRequest;
import com.green.userservice.user.vo.UserResponse;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    void join(UserRequest userRequest);

    UserResponse getUser(Long userId);
}
