package com.lsj.ex08.user;

import com.lsj.ex08.error.BizException;
import com.lsj.ex08.error.ErrorCode;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public void insert(UserReqDto userReqDto) {

        Optional<User> optionalUser = userRepository.findByEmail(userReqDto.getEmail());

        optionalUser.ifPresent(user1 ->
                {throw new BizException(ErrorCode.DUPLICATE_USER);}
        );

        ModelMapper modelMapper = new ModelMapper();
        User user = modelMapper.map(userReqDto, User.class);

        userRepository.save(user);
    }


}
