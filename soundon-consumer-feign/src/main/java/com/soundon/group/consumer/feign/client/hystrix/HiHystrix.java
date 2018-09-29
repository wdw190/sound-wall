package com.soundon.group.consumer.feign.client.hystrix;

import org.springframework.stereotype.Component;

import com.soundon.group.consumer.feign.client.EurekaClientFeign;

/**
 * 
 * @author XPC
 *
 */
@Component
public class HiHystrix implements EurekaClientFeign {
	@Override
	public String sayHiFromClientEureka(String name) {
		return "hi," + name + ",sorry,error!";
	}
}
