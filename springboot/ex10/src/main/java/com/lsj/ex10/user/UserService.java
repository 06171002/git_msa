package com.lsj.ex10.user;

import org.springframework.stereotype.Service;

@Service
public interface UserService {

    void insert(UserReqDto userReqDto);

    void update(UserReqDto userReqDto);
}
