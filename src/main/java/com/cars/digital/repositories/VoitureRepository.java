package com.cars.digital.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cars.digital.domain.Voiture;

@Repository
public interface VoitureRepository extends MongoRepository<Voiture, String> {

}
