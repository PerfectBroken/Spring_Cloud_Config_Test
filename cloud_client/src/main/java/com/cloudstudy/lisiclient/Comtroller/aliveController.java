package com.cloudstudy.lisiclient.Comtroller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class aliveController {
    @Value("${name}")
    private String name = "";
    @Value("${age}")
    private String age = "";

    @RequestMapping("/")
    public String home() {
        return "hello world," + name + "'s age is " + age;
    }
}