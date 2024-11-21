package com.green.userservice.user.service;

import com.green.userservice.error.UserException;
import com.green.userservice.jwt.JwtUtils;
import com.green.userservice.user.jpa.UserEntity;
import com.green.userservice.user.jpa.UserRepository;
import com.green.userservice.user.vo.LoginResponse;
import com.green.userservice.user.vo.UserRequest;
import com.green.userservice.user.vo.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final JwtUtils jwtUtils;

    @Override
    public void join(UserRequest userRequest) {

        String email = userRequest.getEmail();

        userRepository.findByEmail(email)
                .ifPresent(user -> {
                    throw new UserException(String.format("User email %s already exist", email));
                });

        UserEntity entity = userRequest.toEntity();
        entity.setUserId(UUID.randomUUID().toString());

        userRepository.save(entity);
    }

    @Override
    public UserResponse getUser(Long userId) {

        UserEntity userEntity = userRepository.findById(userId)
                .orElseThrow(() -> new UserException(String.format("User id %s not found", userId)));

        return UserResponse.from(userEntity);
    }

    @Override
    public List<UserResponse> getUserList() {

        return userRepository.findAll().stream()
                .map(UserResponse::from)
                .toList();
    }

    @Override
    public LoginResponse login(String email, String password) {

        // email password 확인 하고 틀리면 Exception 처리
        UserEntity userEntity =
                userRepository.findByEmailAndPassword(email, password)
                        .orElseThrow(
                                () ->
                                        new UserException("Invalid email or password")
                        );
        // 로그인한 유저가 있으면 loginResponse 객체 생성해서 controller에 반환
        LoginResponse loginResponse = new LoginResponse();
        loginResponse.setUserId(userEntity.getUserId());
        loginResponse.setAccessToken(jwtUtils.createAccessToken(userEntity.getEmail(), userEntity.getUserId()));
        loginResponse.setRefreshToken(jwtUtils.createRefreshToken(userEntity.getEmail()));
        loginResponse.setEmail(userEntity.getEmail());

        return loginResponse;
    }
}
