package com.lsj.ex04.test;

import com.lsj.ex04.obj.AA;
import com.lsj.ex04.obj.BB;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final AA aa;
    private final BB bb;


    @GetMapping("aa")
    public String aa() {
        return "AA";
    }

    @PostMapping("bb")
    public String bb() {
        return "BB";
    }
}
