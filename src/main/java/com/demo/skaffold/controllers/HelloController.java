package com.demo.skaffold.controllers;

import com.demo.skaffold.config.MyConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    public MyConfig myConfig;

    @GetMapping("/hello")
    public String hello() {
        return myConfig.getMessage();
    }
}
