package com.ust.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class FirsrestApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirsrestApplication.class, args);
	}

}
