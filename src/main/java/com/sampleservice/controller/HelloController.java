package com.sampleservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")
public class HelloController {
	
	
	@Value("${casename}")
	private String value;
	
	@GetMapping("/1")
	private String hello() {
		
		return value;
	}

}
