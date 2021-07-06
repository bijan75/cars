package com.cars.digital.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cars.digital.domain.Client;
import com.cars.digital.repositories.ClientRepository;

@Service
public class ClientService {

	@Autowired
	ClientRepository clientRepository;

	public void add(Client client) {

		clientRepository.save(client);

	}
}
