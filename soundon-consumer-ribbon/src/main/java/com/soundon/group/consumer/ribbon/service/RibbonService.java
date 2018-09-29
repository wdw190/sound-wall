package com.soundon.group.consumer.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * 
 * @author XPC
 *
 */
@Service
public class RibbonService {

	@Autowired
	RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod = "hiError")
	public String hi(String name) {
		return restTemplate.getForObject("http://eureka-client/hi?name=" + name, String.class);
	}

	public String hiError(String name) {
		return "hi," + name + ",sorry,error!";
	}
}
