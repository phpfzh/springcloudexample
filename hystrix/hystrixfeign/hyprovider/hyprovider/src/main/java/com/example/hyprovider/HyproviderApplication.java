package com.example.hyprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class HyproviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(HyproviderApplication.class, args);
	}

}
