package com.lsj.ex10.user;

import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
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
    private final UserService userService;

    @GetMapping("select")
    public ResponseEntity<List<User>> select(){
        return ResponseEntity.status(200).body(userRepository.findAll());
    }

    @PostMapping("insert")
    public ResponseEntity<String> insert(@Valid @RequestBody UserReqDto userReqDto){

        userService.insert(userReqDto);

        return ResponseEntity.status(200).body("success insert");
    }

    @PutMapping("update")
    public ResponseEntity<String> update(@Valid @RequestBody UserReqDto userReqDto) {
        ModelMapper modelMapper = new ModelMapper();
        User user = modelMapper.map(userReqDto, User.class);

        userRepository.save(user);

        return ResponseEntity.status(200).body("success update");
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> delete(@PathVariable(name = "id") Long id) {
        userRepository.deleteById(id);
        return ResponseEntity.status(200).body("success delete");
    }
}
