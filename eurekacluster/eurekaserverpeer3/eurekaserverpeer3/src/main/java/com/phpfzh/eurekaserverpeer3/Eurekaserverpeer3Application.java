package com.phpfzh.eurekaserverpeer3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Eurekaserverpeer3Application {

	public static void main(String[] args) {
		SpringApplication.run(Eurekaserverpeer3Application.class, args);
	}

}
