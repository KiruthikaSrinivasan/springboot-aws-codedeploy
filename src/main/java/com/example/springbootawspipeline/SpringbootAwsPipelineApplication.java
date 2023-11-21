package com.example.springbootawspipeline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootAwsPipelineApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAwsPipelineApplication.class, args);
	}
	@GetMapping("/")
	public String getData()
	{
		return "HELLO KIRUTHIKA FROM AMIZHTH TECHNO SOLUTIONS";
	}
}
