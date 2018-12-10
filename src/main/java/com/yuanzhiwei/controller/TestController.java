package com.yuanzhiwei.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yuanzhiwei.service.TestService;

@RestController
public class TestController {
	
	@Autowired
	private TestService testService;
	
	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
	
	@GetMapping("/haha")
	public String haha() {
		return "haha";
	}
	
	@GetMapping("/error1")
	public int error() { 
		return 1/0;
	}
	
	@GetMapping("/async")
	public String async() {
		testService.asyncTest();
		return "success";
	}
	
	@GetMapping("/async1")
	public String async1() {
		return testService.asyncTest();
	}
}
