package com.lsj.ex10.freeboard;

import jakarta.servlet.http.HttpServlet;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.HttpServletBean;


@Controller
@Slf4j
public class TestController {

    @GetMapping("/test")
    public String getMethodName() {

        log.info("test...");
        return "index";
    }
    

}
