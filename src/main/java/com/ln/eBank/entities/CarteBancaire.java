package com.ln.eBank.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Entity
@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class CarteBancaire extends AbstractEntity {
	private int numCB;
	private int anneeFinCB;
	private int moisFinCB;
	@OneToMany(mappedBy = "carteBancaire")
	private List<OperationsBancaires> operationsBancaires;
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "id_client")
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JsonIgnore
	private Client client;
}
