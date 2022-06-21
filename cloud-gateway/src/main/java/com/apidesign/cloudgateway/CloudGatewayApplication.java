package com.apidesign.cloudgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@SuppressWarnings("deprecation")
@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
@EnableCircuitBreaker
public class CloudGatewayApplication {

	@HystrixCommand(defaultFallback = "/test")
	public static void main(String[] args) {
		SpringApplication.run(CloudGatewayApplication.class, args);
	}

	public String test() {
		System.out.println("############test#################");
		return "This is default fallBack method.";
	}

}
