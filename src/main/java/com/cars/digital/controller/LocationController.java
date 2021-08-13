package com.cars.digital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cars.digital.domain.Location;
import com.cars.digital.services.LocationService;

@RestController
public class LocationController {

	@Autowired
	LocationService locationService;

	@PostMapping("/api/locations")
	public ResponseEntity<Void> ajouterLocation(@Validated @RequestBody(required = true) Location location) {
		// org.slf4j.LoggerFactory.getLogger(VoitureController.class).info(voiture.toString());
		locationService.ajouterLocation(location);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}

}
