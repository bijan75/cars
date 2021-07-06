package com.cars.digital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.cars.digital.domain.Person;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.cars.digital.repositories")
public class DigitalApplication {

	public static void main(String[] args) {
		SpringApplication.run(DigitalApplication.class, args);
	}
	
	

}
