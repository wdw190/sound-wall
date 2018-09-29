package com.soundon.group.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SoundonProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoundonProviderApplication.class, args);
	}
}
