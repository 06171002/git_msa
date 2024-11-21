package com.green.userservice.user;


import com.green.userservice.user.service.UserService;
import com.green.userservice.user.vo.LoginResponse;
import com.green.userservice.user.vo.UserRequest;
import com.green.userservice.user.vo.UserResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user-service")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("join")
    public ResponseEntity<?> joinUser(@Valid @RequestBody UserRequest userRequest) {

        userService.join(userRequest);
        return ResponseEntity.ok(null);
    }

    @GetMapping("list")
    public ResponseEntity<?> getUsers() {

        return ResponseEntity.ok(userService.getUserList());
    }

    @GetMapping("login")
    public ResponseEntity<?> getUser(@RequestParam(value = "email") String email,
                                     @RequestParam(value = "password") String password) {
        LoginResponse response = userService.login(email, password);
        return ResponseEntity.ok(response);
    }

    @GetMapping("kakaologin")
    public ResponseEntity<String> getKakaoLogin() {
        return ResponseEntity.ok(null);
    }
}
