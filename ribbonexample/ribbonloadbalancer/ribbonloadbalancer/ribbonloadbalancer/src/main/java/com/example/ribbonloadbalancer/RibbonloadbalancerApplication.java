package com.example.ribbonloadbalancer;

import com.example.ribbonloadbalancer.config.AvoidScan;
import com.example.ribbonloadbalancer.config.RibbonConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
@RibbonClient(name = "ribbonclient",configuration = RibbonConfiguration.class)
/*@RibbonClients(value = {
		@RibbonClient(name = "ribbonclient",configuration = RibbonConfiguration.class),
		@RibbonClient(name = "ribbonclientB",configuration = RibbonConfiguration.class)

})*/
@ComponentScan(excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,value = {AvoidScan.class})})
public class RibbonloadbalancerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RibbonloadbalancerApplication.class, args);
	}


	@Bean
	@LoadBalanced
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
}
