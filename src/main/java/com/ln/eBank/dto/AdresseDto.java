package com.ln.eBank.dto;

import com.ln.eBank.entities.Adresse;
import com.ln.eBank.entities.Client;

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
public class AdresseDto {
	private long id;

	private String avenue;

	private Integer numero;

	private Integer codePostal;

	private String ville;

	private String pays;

	private Client client;

	public static Adresse mapToEntity(AdresseDto adr) {
		return Adresse.builder().id(adr.getId()).avenue(adr.getAvenue()).numero(adr.getNumero())
				.codePostal(adr.getCodePostal()).ville(adr.getVille()).pays(adr.getPays()).client(adr.getClient())
				.build();
	}

	public static AdresseDto mapToDto(Adresse adr) {
		return AdresseDto.builder().id(adr.getId()).avenue(adr.getAvenue()).numero(adr.getNumero())
				.codePostal(adr.getCodePostal()).ville(adr.getVille()).pays(adr.getPays()).build();
	}
}
