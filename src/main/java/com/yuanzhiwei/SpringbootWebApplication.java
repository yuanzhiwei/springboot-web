package com.yuanzhiwei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

import com.yuanzhiwei.config.StartConfig;

@EnableAsync
@SpringBootApplication
public class SpringbootWebApplication {

	public static void main(String[] args) {
		//new StartConfig(args);
		SpringApplication.run(SpringbootWebApplication.class, args);
	}
}
