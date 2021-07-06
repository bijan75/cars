package com.cars.digital.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cars.digital.domain.Person;
import com.cars.digital.repositories.PersonRepository;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepository personRepository;
	
	public void addPerson(Person person) {
		
		personRepository.save(person);
		
	}

}
