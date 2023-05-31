package com.ln.eBank.services;

import com.ln.eBank.dto.ClientDto;

public interface ClientService extends AbstractService<ClientDto> {
	ClientDto creerNouveauClient(ClientDto clientDto);
}
