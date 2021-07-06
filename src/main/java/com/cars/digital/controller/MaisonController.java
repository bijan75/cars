package com.cars.digital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cars.digital.domain.Maison;
import com.cars.digital.services.MaisonService;

@RestController
public class MaisonController {
	
	@Autowired
	MaisonService maisonService;
	
	
	
	@PostMapping("/api/maison")
	public void ajouterMaison (@RequestBody Maison maison) {
		
	maisonService.ajouterMaison(maison);
		
	}
	

}
