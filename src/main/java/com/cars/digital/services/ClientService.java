package com.cars.digital.services;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cars.digital.domain.Client;
import com.cars.digital.repositories.ClientRepository;

@Service
public class ClientService {
	// private Date dob = new Date();
	@Autowired
	ClientRepository clientRepository;

	// Calendar calendar = obj.dateToCalendar(client.getDateNaissance());

	public void add(Client client) {

		// dob=client.getDateNaissance();

		Calendar calendar = new GregorianCalendar();
		calendar.setTime(client.getDateNaissance());
		int year = calendar.get(Calendar.YEAR);
		System.out.print(year);
		System.out.print(LocalDate.now().getYear());

		if (LocalDate.now().getYear() - year >= 18) {
			clientRepository.save(client);

		} else {
			System.out.print("Vous etes pas encore eligible");

		}
	}

	public List<Client> getClients() {
		return clientRepository.findAll();
	}

}
