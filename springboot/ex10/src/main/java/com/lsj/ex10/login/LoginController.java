//package com.lsj.ex10.login;
//
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequiredArgsConstructor
//@Slf4j
//public class LoginController {
//
//    private final LoginService loginService;
//
//    @PostMapping("/join")
//    public String join(@RequestBody JoinDto joinDto) {
//        log.info("pass");
//        loginService.join(joinDto);
//        return "success";
//    }
//}
