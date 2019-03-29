package com.example.ribbondemoclient.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/add")
	public String add(Integer a, Integer b, HttpServletRequest request){
		System.out.println("================="+a);
		return " From Port: "+ request.getServerPort() + ", Result: " + (a + b);
	}
}
