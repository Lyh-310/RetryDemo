package com.example.retrydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.retry.annotation.EnableRetry;

@SpringBootApplication
@EnableRetry
public class RetryDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RetryDemoApplication.class, args);
	}

}
