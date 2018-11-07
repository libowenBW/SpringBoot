package com.bobby.spring.boot.blog.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	
	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello Spring-boot!";
	}

}
