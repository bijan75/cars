package com.cars.digital.domain;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document
@Data
public class Person {

	private String name;
	
	private short age; 
}
