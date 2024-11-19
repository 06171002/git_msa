package com.green.userservice.user.service;

import com.green.userservice.error.UserException;
import com.green.userservice.user.jpa.UserEntity;
import com.green.userservice.user.jpa.UserRepository;
import com.green.userservice.user.vo.UserRequest;
import com.green.userservice.user.vo.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

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
}
