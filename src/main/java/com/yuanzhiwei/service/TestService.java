package com.yuanzhiwei.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class TestService {
	
	@Async
	public String asyncTest() {
		try {
			Thread.sleep(5000);
			int i = 5/0;
			System.out.println(i);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "success";
	}
}