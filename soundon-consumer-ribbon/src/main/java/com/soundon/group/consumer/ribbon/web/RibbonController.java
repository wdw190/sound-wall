package com.soundon.group.consumer.ribbon.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.soundon.group.consumer.ribbon.service.RibbonService;

/**
 * 
 * @author XPC
 *
 */
@RestController
public class RibbonController {

	@Autowired
	RibbonService ribbonService;

	@GetMapping("/hi")
	public String hi(@RequestParam(required = false, defaultValue = "wdw102856") String name) {
		return ribbonService.hi(name);
	}

	@Autowired
	private LoadBalancerClient loadBalancer;

	@GetMapping("/testRibbon")
	public String testRibbon() {
		ServiceInstance instance = loadBalancer.choose("eureka-client");
		// URI uri = URI.create(String.format("http://%s:%s", instance.getHost(),
		// instance.getPort()));
		return instance.getHost() + ":" + instance.getPort();
	}
}
