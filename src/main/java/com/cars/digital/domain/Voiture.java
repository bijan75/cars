package com.cars.digital.domain;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.Data;

@Data
public class Voiture {

	@NotBlank(message = "immatriculation non valide")
	@Pattern(regexp = "[A-Z]{2}-[0-9]{3}-[A-Z]{2}", message = "format non valide")
	private String immatriculation;

	@NotBlank(message = "marque non valide")
	private String marque;

	@NotBlank(message = "modele non valide")
	private String modele;

	@NotNull(message = "date non valide")
	private Date dateCirculation;

}
