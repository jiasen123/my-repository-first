package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/hello")
    public String hello() {
        String s1 = "改动1也修改了,现在是改动4";
        return s1;
    }
}
