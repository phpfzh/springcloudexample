package com.example.hystrixhello.controller;

import com.example.hystrixhello.serivce.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private IUserService iUserService;

    @GetMapping("/getUser")
    public String getUser(@RequestParam("username") String username)throws Exception{
        return iUserService.getUser(username);
    }
}
