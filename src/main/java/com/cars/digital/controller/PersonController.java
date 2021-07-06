package com.cars.digital.controller;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cars.digital.domain.Person;
import com.cars.digital.services.PersonService;

@RestController
public class PersonController {

	Logger log = org.slf4j.LoggerFactory.getLogger(PersonController.class);

	@Autowired
	private PersonService personService;

	@PostMapping("/api/person")
	public ResponseEntity<Void> addPerson(@RequestBody Person person) {

		// log.info("name is {}, age is {}", person.getName(), person.getAge());
		personService.addPerson(person);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
}
