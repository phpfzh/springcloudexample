package com.phpfzh.eurekaserverpeer2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Eurekaserverpeer2Application {

	public static void main(String[] args) {

		SpringApplication.run(Eurekaserverpeer2Application.class, args);

	}

}
