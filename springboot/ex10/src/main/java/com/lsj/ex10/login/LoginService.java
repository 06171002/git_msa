//package com.lsj.ex10.login;
//
//import com.lsj.ex10.user.User;
//import com.lsj.ex10.user.UserRepository;
//import lombok.RequiredArgsConstructor;
//import org.modelmapper.ModelMapper;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//
//@Service
//@RequiredArgsConstructor
//public class LoginService {
//
//    private final UserRepository userRepository;
//    private final PasswordEncoder passwordEncoder;
//    private final ModelMapper modelMapper;
//
//    public void join(JoinDto joinDto) {
//
//        User user = modelMapper.map(joinDto, User.class);
//
//        user.setPassword(passwordEncoder.encode(joinDto.getPassword()));
//        user.setRole("ADMIN");
//
//        User dbuser = userRepository.save(user);
//    }
//
//}
