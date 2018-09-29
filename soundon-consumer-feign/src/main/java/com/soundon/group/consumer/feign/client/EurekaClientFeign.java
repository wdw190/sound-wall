package com.soundon.group.consumer.feign.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.soundon.group.consumer.feign.client.config.FeignConfig;
import com.soundon.group.consumer.feign.client.hystrix.HiHystrix;

/**
 * 
 * @author XPC
 *
 */
//value为远程调用其它服务的服务名
@FeignClient(value = "eureka-client", configuration = FeignConfig.class,fallback = HiHystrix.class)
public interface EurekaClientFeign {
	@GetMapping(value = "/hi")
	String sayHiFromClientEureka(@RequestParam(value = "name") String name);
}
