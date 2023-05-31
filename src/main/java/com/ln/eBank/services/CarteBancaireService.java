package com.ln.eBank.services;

import com.ln.eBank.dto.CarteBancaireDto;

public interface CarteBancaireService extends AbstractService<CarteBancaireDto> {

	CarteBancaireDto creerCarteBancaire(long idClient, CarteBancaireDto cb);

}
