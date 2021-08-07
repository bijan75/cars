package com.cars.digital.domain;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class Client {

	@NotBlank(message = "cin doit pas etre vide")
	@Pattern(regexp = "[A-Z]{2,3}[0-9]{4,5}", message = "Format non valide")
	@Id
	private String cin;

	@NotBlank
	@Length(min = 2, max = 20, message = "votre nom doit contenir au moins 2 lettres")
	private String nom;

	@NotBlank
	private String prenom;

	@NotNull
	private Date dateNaissance;

	private EtatClient etat = EtatClient.EN_REGLE;

}
