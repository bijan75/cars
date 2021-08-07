package com.cars.digital.services;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cars.digital.controller.errors.ArgumentsNotValidException;
import com.cars.digital.domain.Client;
import com.cars.digital.domain.EtatVoiture;
import com.cars.digital.domain.Location;
import com.cars.digital.domain.Voiture;
import com.cars.digital.repositories.ClientRepository;
import com.cars.digital.repositories.VoitureRepository;

@Service
public class LocationService {

	private Logger logger = LoggerFactory.getLogger(LocationService.class);

	@Autowired
	private VoitureRepository voitureRespository;

	@Autowired
	private ClientRepository clientRepository;

	// @Autowired
	// Client client;

	public void ajouterLocation(Location location) {

		if (location.getDateDebut().compareTo(location.getDateFin()) >= 0) {
			throw new ArgumentsNotValidException("dates non valides");

		}

		String cin = location.getCin();
		Optional<Client> optionalClient = clientRepository.findById(cin);
		// clientRepository.findBy

		if (optionalClient.isPresent()) {
			Optional<Voiture> optionalVoiture = voitureRespository.findById(location.getImmatriculation());

			if (optionalVoiture.isPresent()) {

				Voiture persistedVoiture = optionalVoiture.get();

				if (persistedVoiture.getEtat() == EtatVoiture.DISPONIBLE) {

					persistedVoiture.setDebutLocation(location.getDateDebut());
					persistedVoiture.setFinLocation(location.getDateFin());
					persistedVoiture.setCinLocateur(cin);
					logger.info(persistedVoiture.toString());
					voitureRespository.save(persistedVoiture);
				} else {

					System.out.print("Voiture non disponible pour le moment");
				}

			}

		} else {
			System.out.print("client non exist");

		}

	}

}
