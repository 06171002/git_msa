package com.lsj.ex10.user;

import com.lsj.ex10.error.BizException;
import com.lsj.ex10.error.ErrorCode;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    @Override
    public void insert(UserReqDto userReqDto) {
        Optional<User> optionalUser = userRepository.findByEmail(userReqDto.getEmail());

        optionalUser.ifPresent(user1 ->
                {throw new BizException(ErrorCode.DUPLICATE_USER);}
        );

        User user = modelMapper.map(userReqDto, User.class);

        userRepository.save(user);
    }

    @Override
    public void update(UserReqDto userReqDto) {
        User user = modelMapper.map(userReqDto, User.class);

        User dbUser = userRepository.findById(user.getId()).orElseThrow(() -> new BizException(ErrorCode.NOT_FOUND));

        user.setDate(dbUser.getDate());
        user.setEmail(dbUser.getEmail());
        user.setPassword(dbUser.getPassword());

        userRepository.save(user);
    }
}
