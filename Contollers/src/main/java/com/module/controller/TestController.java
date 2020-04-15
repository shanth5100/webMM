package com.module.controller;

import javax.annotation.Resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.module.service.TestService;

@RestController
@RequestMapping("/test")
public class TestController {
	
	@Resource(name = "testService")
	TestService testService;
	
	@GetMapping("/1")
	private ResponseEntity<?> test() {
		testService.sendEmail();
		return null;
	}
}
