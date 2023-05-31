package com.ln.eBank.services.impl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ln.eBank.dto.ClientDto;
import com.ln.eBank.entities.Adresse;
import com.ln.eBank.entities.Client;
import com.ln.eBank.repositories.AdresseRepository;
import com.ln.eBank.repositories.ClientRepository;
import com.ln.eBank.services.AdresseService;
import com.ln.eBank.services.ClientService;

@Service
public class ClientServiceImpl implements ClientService {

	@Autowired
	private AdresseRepository adresseRepository;

	@Autowired
	private ClientRepository clientRepository;

	@Autowired
	private AdresseService adresseService;

	@Override
	public ClientDto creerNouveauClient(ClientDto clientDto) {

		Adresse adresse = clientDto.getAdresse();
		adresse.setCreatedDate(LocalDateTime.now());

		Client currentCl = ClientDto.mapToEntity(clientDto);

		// Set child reference(adresse) in parent entity(Client)
		currentCl.setCreatedDate(LocalDateTime.now());
		currentCl.setAdresse(adresse);

		// Set parent reference(Client) in child entity(adresse)
		adresse.setClient(currentCl);

		// Save Parent Reference (which will save the child as well)
		Client clientSaved = clientRepository.save(currentCl);

		return ClientDto.mapToDto(clientSaved);
	}

	public ClientDto ajoutClient(ClientDto clientDto) {

		Adresse adresse = clientDto.getAdresse();
		adresse.setCreatedDate(LocalDateTime.now());

		Client currentCl = ClientDto.mapToEntity(clientDto);

		// Set child reference(adresse) in parent entity(Client)
		currentCl.setAdresse(adresse);

		// Set parent reference(Client) in child entity(adresse)
		adresse.setClient(currentCl);

		// Save Parent Reference (which will save the child as well)
		Client clientSaved = clientRepository.save(currentCl);

		return ClientDto.mapToDto(clientSaved);
	}

	@Override
	public long save(ClientDto dto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<ClientDto> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClientDto findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub

	}

}
