package com.cars.digital.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cars.digital.domain.Voiture;
import com.cars.digital.repositories.VoitureRepository;

@Service
public class VoitureService {

	@Autowired
	VoitureRepository voitureRepository;

	public void add(Voiture voiture) {
		voitureRepository.save(voiture);

	}

}
