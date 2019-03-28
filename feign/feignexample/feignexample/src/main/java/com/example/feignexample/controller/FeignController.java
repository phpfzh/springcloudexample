package com.example.feignexample.controller;

import com.example.feignexample.service.HelloFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

    @Autowired
    HelloFeignService helloFeignService;

    @RequestMapping("/search/repositories")
    public String hello(@RequestParam("str") String str){
        return helloFeignService.searchRepo(str);
    }
}


