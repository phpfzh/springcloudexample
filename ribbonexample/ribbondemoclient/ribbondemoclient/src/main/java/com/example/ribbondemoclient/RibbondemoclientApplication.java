package com.example.ribbondemoclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RibbondemoclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(RibbondemoclientApplication.class, args);
	}
	
}
