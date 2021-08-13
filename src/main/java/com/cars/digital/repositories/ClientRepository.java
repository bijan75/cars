package com.cars.digital.repositories;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cars.digital.domain.Client;

@Repository
public interface ClientRepository extends MongoRepository<Client, String> {

	Optional<Client> findByNom(String nom);

}
