package com.soundon.group.consumer.feign.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.soundon.group.consumer.feign.service.HiService;

/**
 * 
 * @author XPC
 *
 */
@RestController
public class HiController {
	@Autowired
	HiService hiService;

	@GetMapping("/hi")
	public String sayHi(@RequestParam(defaultValue = "wdw102855", required = false) String name) {
		return hiService.sayHi(name);
	}
}
