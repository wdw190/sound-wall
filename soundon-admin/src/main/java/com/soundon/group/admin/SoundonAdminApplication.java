package com.soundon.group.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

import de.codecentric.boot.admin.config.EnableAdminServer;

@SpringBootApplication
@EnableTurbine
@EnableHystrixDashboard
@EnableHystrix
@EnableAdminServer
@EnableEurekaClient
public class SoundonAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoundonAdminApplication.class, args);
	}
}
