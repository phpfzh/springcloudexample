package com.example.hystrixhello.serivce.impl;

import com.example.hystrixhello.serivce.IUserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements IUserService {

   /* 测试：
    */

    @Override
    @HystrixCommand(fallbackMethod = "defaultUser")
    public String getUser(String username) throws Exception {
        if(username.equals("Spring")){
            return "This is real user";
        }else {
            throw new Exception();
        }
     }

    public String defaultUser(String username){
        System.out.println("==username=="+username);
        return "The user does not exist in this system";
    }
}
