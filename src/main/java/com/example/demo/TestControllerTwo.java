package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/hello")
    public String hello() {
        String s2 = "改动2又修改了,现在是改动3,先提交改动3,再次修改,现在是改动6";
        return s2;
    }
}
