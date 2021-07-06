package com.cars.digital.domain;

import java.sql.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import lombok.Data;

@Data
public class Client {

	@NotBlank(message = "cin doit pas etre vide")
	@Pattern(regexp = "[A-Z]{3}", message = "Format non valide")
	private String cin;

	// @NotBlank
	private String nom;

	// @NotBlank
	private String prenom;

	// @NotBlank
	private Date dateNaissance;

}
