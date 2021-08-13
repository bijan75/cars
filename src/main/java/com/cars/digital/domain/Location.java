package com.cars.digital.domain;

import java.util.Date;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class Location {

	private String cin;
	private String immatriculation;

	@NotNull
	private Date dateDebut;

	@NotNull
	private Date dateFin;

}
