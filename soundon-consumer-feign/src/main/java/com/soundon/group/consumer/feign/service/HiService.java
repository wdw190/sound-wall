package com.soundon.group.consumer.feign.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soundon.group.consumer.feign.client.EurekaClientFeign;

/**
 * 
 * @author XPC
 *
 */
@Service
public class HiService {

	@Autowired
	EurekaClientFeign eurekaClientFeign;

	public String sayHi(String name) {
		return eurekaClientFeign.sayHiFromClientEureka(name);
	}
}
