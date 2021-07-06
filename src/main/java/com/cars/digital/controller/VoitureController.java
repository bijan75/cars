package com.cars.digital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cars.digital.domain.Voiture;
import com.cars.digital.services.VoitureService;

@RestController
public class VoitureController {

	@Autowired
	VoitureService voitureService;

	@PostMapping("/api/cars")
	public ResponseEntity<Void> addVoiture(@Validated @RequestBody(required = true) Voiture voiture) {
		org.slf4j.LoggerFactory.getLogger(VoitureController.class).info(voiture.toString());
		voitureService.add(voiture);
		return new ResponseEntity<Void>(HttpStatus.CREATED);

	}

}
