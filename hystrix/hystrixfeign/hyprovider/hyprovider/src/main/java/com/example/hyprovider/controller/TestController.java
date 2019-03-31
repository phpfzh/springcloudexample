package com.example.hyprovider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("getUser")
    public String getUser(@RequestParam("username") String username){
        return "This is real user";
    }
}
