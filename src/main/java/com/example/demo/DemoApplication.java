package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages= {"com.controller,com.model"})
@EntityScan(basePackages="com.model")
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("Hello World");
		SpringApplication.run(DemoApplication.class, args);
	}

}
