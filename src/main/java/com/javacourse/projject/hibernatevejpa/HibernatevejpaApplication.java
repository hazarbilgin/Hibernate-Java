package com.javacourse.projject.hibernatevejpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import com.javacourse.projject.hibernatevejpa.Entities.city;
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})

public class HibernatevejpaApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(HibernatevejpaApplication.class, args);
		System.out.println("sadasda");
		
		
		
	}

}
