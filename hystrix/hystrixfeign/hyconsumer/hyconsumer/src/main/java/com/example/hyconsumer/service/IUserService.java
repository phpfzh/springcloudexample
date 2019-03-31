package com.example.hyconsumer.service;

import com.example.hyconsumer.service.impl.UserServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "hyprovider",fallback = UserServiceFallback.class)
public interface IUserService {

    @RequestMapping(value = "getUser",method = RequestMethod.GET)
    public String getUser(@RequestParam("username") String username);
}
