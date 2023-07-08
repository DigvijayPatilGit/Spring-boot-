package com.springbootchangingportno;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootChangingPortnoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootChangingPortnoApplication.class, args);
	}
	
	//oper src/main/resources
	//then open appication.properties file in it
	//at first line type "server.port= any port no starts from without 0"
	//if we give 0 as a port no ,it automatic select the random port no

}
