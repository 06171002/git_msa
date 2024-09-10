package com.lsj.ex05.user;

import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // url 맵하는 클래스야
@RequestMapping("user") // 주소줄에 user로 시작하는거야
@RequiredArgsConstructor
@CrossOrigin
public class UserController {

    private final UserRepository userRepository;

    @GetMapping("select")
    public List<User> select(){
        return userRepository.findAll();
    }

    @PostMapping("insert")
    public String insert(@Valid @RequestBody UserReqDto userReqDto){

        ModelMapper modelMapper = new ModelMapper();
        User user = modelMapper.map(userReqDto, User.class);

        userRepository.save(user);

        return "ok";
    }

    @PutMapping("update")
    public String update(@Valid @RequestBody UserReqDto userReqDto) {
        ModelMapper modelMapper = new ModelMapper();
        User user = modelMapper.map(userReqDto, User.class);

        userRepository.save(user);

        return "ok";
    }

    @DeleteMapping("delete/{id}")
    public String delete(@PathVariable(name = "id") Long id) {
        userRepository.deleteById(id);
        return "deleted";
    }
}
