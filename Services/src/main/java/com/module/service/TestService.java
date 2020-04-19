package com.module.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.module.dao.TestDao;
import com.module.dao.TestDaoInterface;

@Service("testService")
public class TestService implements TestServ{
//	@Resource(name = "testRepo")
	@Autowired
	TestDao testDao;
//	
//	@Autowired
//	TestDaoInterface testDaoInterface;
	public void sendEmail() {
		System.out.println("Service Layer called succesfully");
		testDao.test();
//		testDaoInterface.test();
	}
}
