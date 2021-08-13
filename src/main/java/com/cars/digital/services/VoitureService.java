package com.cars.digital.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import com.cars.digital.controller.errors.DBCustomExcepction;
import com.cars.digital.domain.Voiture;
import com.cars.digital.repositories.VoitureRepository;

@Service
public class VoitureService {

	@Autowired
	VoitureRepository voitureRepository;

	public void ajouterVoiture(Voiture voiture) {
		try {
			voitureRepository.save(voiture);
		} catch (DataAccessException e) {
			throw new DBCustomExcepction("ma mongo n'est pas joignnable", e);
		}

	}

	public void supprimerVoiture(String id) {

		Optional<Voiture> optionalVoiture = voitureRepository.findById(id);

		if (optionalVoiture.isPresent()) {

			voitureRepository.deleteById(id);

		} else {
			throw new HttpClientErrorException(HttpStatus.BAD_REQUEST);
		}

	}

}
