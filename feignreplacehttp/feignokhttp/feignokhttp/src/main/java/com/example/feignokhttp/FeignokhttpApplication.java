package com.example.feignokhttp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeignokhttpApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignokhttpApplication.class, args);
	}

}
