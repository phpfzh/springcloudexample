package com.example.ribbonclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class RibbonClientController {

    @GetMapping("add")
    public String add(Integer a, Integer b, HttpServletRequest request){
        return "端口："+request.getServerPort()+",结果："+(a+b);
    }
}
