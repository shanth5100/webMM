package com.module.service;

import org.springframework.stereotype.Service;

@Service
public class TestService {
	public void sendEmail() {
		System.out.println("Service Layer called succesfully");
	}
}
