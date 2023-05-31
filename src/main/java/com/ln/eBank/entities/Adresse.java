package com.ln.eBank.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Entity
@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class Adresse extends AbstractEntity {
	private String avenue;

	private Integer numero;

	private Integer codePostal;

	private String ville;

	private String pays;

	@OneToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "id_Client", nullable = false)
	@JsonIgnore
	private Client client;
}
