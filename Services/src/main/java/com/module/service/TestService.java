package com.module.service;

import org.springframework.stereotype.Service;

@Service("testService")
public class TestService implements TestServ{
	public void sendEmail() {
		System.out.println("Service Layer called succesfully");
	}
}
