package com.module;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.module.*")
public class MultiModule {

	public static void main(String[] args) {
		SpringApplication.run(MultiModule.class, args);
	}

}
