package com.ln.eBank.services.impl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ln.eBank.dto.AdresseDto;
import com.ln.eBank.entities.Adresse;
import com.ln.eBank.entities.Client;
import com.ln.eBank.repositories.AdresseRepository;
import com.ln.eBank.repositories.ClientRepository;
import com.ln.eBank.services.AdresseService;

@Service
public class AdresseServiceImpl implements AdresseService {

	@Autowired
	private AdresseRepository adresseRepository;

	@Autowired
	private ClientRepository clientRepository;

	@Override
	public AdresseDto creerAdresseClient(AdresseDto adr, String email) {
		Client cl = clientRepository.findByEmail(email);
		adr.setClient(cl);
		Adresse adrToSave = AdresseDto.mapToEntity(adr);
		adrToSave.setCreatedDate(LocalDateTime.now());
		Adresse adresseSaved = adresseRepository.save(adrToSave);
		return AdresseDto.mapToDto(adresseSaved);
	}

	@Override
	public long save(AdresseDto dto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<AdresseDto> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AdresseDto findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub

	}

}
