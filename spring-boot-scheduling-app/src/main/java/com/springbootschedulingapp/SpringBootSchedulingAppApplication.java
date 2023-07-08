package com.springbootschedulingapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBootSchedulingAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSchedulingAppApplication.class, args);
	}

}
