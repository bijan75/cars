package com.cars.digital.domain;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "house")
public class Maison {
	private String adresse;
	private int metrage;

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getMetrage() {
		return metrage;
	}

	public void setMetrage(int metrage) {
		this.metrage = metrage;
	}

}
