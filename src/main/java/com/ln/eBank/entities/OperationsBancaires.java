package com.ln.eBank.entities;

import java.time.LocalDateTime;

import com.ln.eBank.utils.TypeOperation;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Entity
@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
public class OperationsBancaires extends AbstractEntity {
	@Enumerated(EnumType.STRING)
	private TypeOperation typeOperation;
	private String intituleOperation;
	private LocalDateTime dateHeureOperation;
	private double montantOperation;
	@ManyToOne
	@JoinColumn(name = "id_carte_bancaire")
	private CarteBancaire carteBancaire;
}
