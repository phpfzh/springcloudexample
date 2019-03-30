package com.example.ribbonloadbalancer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

    @Autowired
    private RestTemplate   restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("/add")
    public String adda(Integer a,Integer b){
        String result = restTemplate.getForObject("http://ribbonclient/add?a="+a+"&b="+b,String.class);
        System.out.println("result======"+result);
        return result;
     }

    @GetMapping("/add1")
     public void add1(Integer a,Integer b){
        ServiceInstance instance =  this.loadBalancerClient.choose("ribbonclient");
        System.out.println(instance.getHost()+":"+instance.getPort());
     }

    @GetMapping("/add2")
    public void add2(Integer a,Integer b){
        ServiceInstance instance =  this.loadBalancerClient.choose("ribbonclientb");
        System.out.println(instance.getHost()+":"+instance.getPort());
    }
}
