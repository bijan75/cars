package com.cars.digital.domain;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class Voiture {

	@NotBlank(message = "immatriculation non valide")
	@Pattern(regexp = "[A-Z]{2}-[0-9]{3}-[A-Z]{2}", message = "format non valide")
	@Id
	private String immatriculation;

	@NotBlank(message = "marque non valide")
	private String marque;

	@NotBlank(message = "modele non valide")
	private String modele;

	@NotNull(message = "date non valide")
	private Date dateCirculation;

	private EtatVoiture etat = EtatVoiture.DISPONIBLE;

	private Date debutLocation;

	private Date finLocation;

	@Pattern(regexp = "[A-Z]{2}-[0-9]{3}-[A-Z]{2}", message = "format non valide")
	private String cinLocateur;

}
