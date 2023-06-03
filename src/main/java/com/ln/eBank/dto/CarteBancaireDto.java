package com.ln.eBank.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ln.eBank.entities.CarteBancaire;
import com.ln.eBank.entities.Client;
import com.ln.eBank.entities.OperationsBancaires;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CarteBancaireDto {
	private long id;
	private int numCB;
	private int anneeFinCB;
	private int moisFinCB;
	private List<OperationsBancaires> operationsBancaires;
	@JsonIgnore
	private Client client;

	public static CarteBancaire mapToEntity(CarteBancaireDto cb) {
		return CarteBancaire.builder().id(cb.getId()).numCB(cb.getNumCB()).anneeFinCB(cb.getAnneeFinCB())
				.moisFinCB(cb.getMoisFinCB()).operationsBancaires(cb.getOperationsBancaires()).client(cb.getClient())
				.build();
	}

	public static CarteBancaireDto mapToDto(CarteBancaire cb) {
		return CarteBancaireDto.builder().id(cb.getId()).numCB(cb.getNumCB()).anneeFinCB(cb.getAnneeFinCB())
				.moisFinCB(cb.getMoisFinCB()).operationsBancaires(cb.getOperationsBancaires()).client(cb.getClient())
				.build();
	}
}
