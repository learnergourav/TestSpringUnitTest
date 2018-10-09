package com.basicunittest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping("/healthcheck")
	public void HealthCheck() {
		System.out.println("Health Check");
	}
}