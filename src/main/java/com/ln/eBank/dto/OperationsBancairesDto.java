package com.ln.eBank.dto;

import java.time.LocalDateTime;

import com.ln.eBank.entities.CarteBancaire;
import com.ln.eBank.entities.OperationsBancaires;
import com.ln.eBank.utils.TypeOperation;

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
public class OperationsBancairesDto {
	private long id;
	private TypeOperation typeOperation;
	private String intituleOperation;
	private LocalDateTime dateHeureOperation;
	private double montantOperation;
	private CarteBancaire carteBancaire;

	public static OperationsBancaires mapToEntity(OperationsBancairesDto op) {
		return OperationsBancaires.builder().id(op.getId()).typeOperation(op.getTypeOperation())
				.intituleOperation(op.getIntituleOperation()).dateHeureOperation(op.getDateHeureOperation())
				.montantOperation(op.getMontantOperation()).carteBancaire(op.getCarteBancaire()).build();
	}

	public static OperationsBancairesDto mapToDto(OperationsBancaires op) {
		return OperationsBancairesDto.builder().id(op.getId()).typeOperation(op.getTypeOperation())
				.intituleOperation(op.getIntituleOperation()).dateHeureOperation(op.getDateHeureOperation())
				.montantOperation(op.getMontantOperation()).carteBancaire(op.getCarteBancaire()).build();

	}
}
