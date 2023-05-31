package com.ln.eBank.services;

import com.ln.eBank.dto.AdresseDto;

public interface AdresseService extends AbstractService<AdresseDto> {
	AdresseDto creerAdresseClient(AdresseDto adr, String email);
}
