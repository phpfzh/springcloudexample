package com.phpfzh.eurekaserverpeer1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Eurekaserverpeer1Application {

	public static void main(String[] args) {
		SpringApplication.run(Eurekaserverpeer1Application.class, args);
	}

}
