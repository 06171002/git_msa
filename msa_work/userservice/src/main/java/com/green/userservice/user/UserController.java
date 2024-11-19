package com.green.userservice.user;


import com.green.userservice.user.service.UserService;
import com.green.userservice.user.vo.UserRequest;
import com.green.userservice.user.vo.UserResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("join")
    public ResponseEntity<?> joinUser(@Valid @RequestBody UserRequest userRequest) {

        userService.join(userRequest);
        return ResponseEntity.ok(null);
    }

    @GetMapping("login/{user-id}")
    public ResponseEntity<UserResponse> getUser(@PathVariable("user-id") Long userId) {
        UserResponse userResponse = userService.getUser(userId);
        return ResponseEntity.ok(userResponse);
    }

    @GetMapping("kakaologin")
    public ResponseEntity<String> getKakaoLogin() {
        return ResponseEntity.ok(null);
    }
}
