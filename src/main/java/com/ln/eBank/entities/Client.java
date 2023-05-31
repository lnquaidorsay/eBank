package com.ln.eBank.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ln.eBank.utils.Civilite;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
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
public class Client extends AbstractEntity {
	@Enumerated(EnumType.STRING)
	private Civilite civilite;
	private String nom;
	private String prenom;
	private String email;
	private String telephone;
	private String photo;
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "client")
	@JsonIgnore
	private Adresse adresse;
	@OneToMany(mappedBy = "client")
	private List<CarteBancaire> carteBancaire;
}
