package com.cars.digital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cars.digital.domain.Client;
import com.cars.digital.services.ClientService;

@RestController
public class ClientController {

	@Autowired
	ClientService clientService;

	@PostMapping("/api/users")
	public ResponseEntity<Void> addClient(@Validated @RequestBody(required = true) Client client) {
		org.slf4j.LoggerFactory.getLogger(ClientController.class).info(client.toString());
		clientService.add(client);
		return new ResponseEntity<Void>(HttpStatus.CREATED);

	}

	@GetMapping("/api/users")
	public List<Client> getClients() {

		return clientService.getClients();

	}
}
