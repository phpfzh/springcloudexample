package com.example.feignhttpclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeignhttpclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignhttpclientApplication.class, args);
	}

}
