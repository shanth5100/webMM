package com.module;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.module.service.TestService;

@SpringBootApplication(scanBasePackages = "com.module")
public class MultiModule {

	@Autowired
	static TestService testService;
	
	public static void main(String[] args) {
		SpringApplication.run(MultiModule.class, args);
//		testService.sendEmail();
	}

}
