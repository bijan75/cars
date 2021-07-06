package com.cars.digital.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cars.digital.domain.Maison;
import com.cars.digital.repositories.MaisonRepository;

@Service
public class MaisonService {
	@Autowired
	private MaisonRepository maisonRepository;

	public void ajouterMaison(Maison maison) {
		maisonRepository.save(maison);
	}

}
