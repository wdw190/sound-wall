package com.soundon.group.consumer.monitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableTurbine
public class SoundonConsumerMonitorApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoundonConsumerMonitorApplication.class, args);
	}
}
