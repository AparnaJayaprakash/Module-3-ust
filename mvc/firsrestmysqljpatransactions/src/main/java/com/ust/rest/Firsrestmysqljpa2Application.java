package com.ust.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication //(exclude= {DataSourceAutoConfiguration.class})
public class Firsrestmysqljpa2Application {

	public static void main(String[] args) {
		SpringApplication.run(Firsrestmysqljpa2Application.class, args);
	}

}
