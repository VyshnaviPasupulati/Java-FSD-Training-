package com.ibm.boothello.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello SpringBoot";
	}
	
	@GetMapping(value = "/hello", produces="text/html")
	public String sayHelloHtml() {
		return "Hello SpringBoot";
	}
	@GetMapping(value = "/hello" ,produces="application/json")
	public String sayHelloJSon() {
		return "Hello SpringBoot";
	}

	@GetMapping(value="/hola" ,produces="text/html")
	public String sayHola() {
		return "<h1> Hola SpringBoot </h1>";
	}
	
	@GetMapping(value = "/bonjour", produces = "application/json")
	public String sayBonjour() {
		return "{\"greeting\":\"Bonjour Spring Boot\"}";
	}
}
