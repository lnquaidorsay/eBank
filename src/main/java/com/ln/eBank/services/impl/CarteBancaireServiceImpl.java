package com.ln.eBank.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ln.eBank.dto.CarteBancaireDto;
import com.ln.eBank.entities.CarteBancaire;
import com.ln.eBank.entities.Client;
import com.ln.eBank.repositories.CarteBancaireRepository;
import com.ln.eBank.repositories.ClientRepository;
import com.ln.eBank.services.CarteBancaireService;

@Service
public class CarteBancaireServiceImpl implements CarteBancaireService {
	@Autowired
	private ClientRepository clientRepository;

	@Autowired
	private CarteBancaireRepository carteBancaireRepository;

	@Override
	public CarteBancaireDto creerCarteBancaire(long idClient, CarteBancaireDto cb) {
		CarteBancaire currentCb = CarteBancaireDto.mapToEntity(cb);
		Optional<Client> client = clientRepository.findById(idClient);
		currentCb.setClient(client.get());
		CarteBancaire carteBancaire = carteBancaireRepository.save(currentCb);
		return CarteBancaireDto.mapToDto(carteBancaire);
	}

	@Override
	public long save(CarteBancaireDto dto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<CarteBancaireDto> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CarteBancaireDto findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub

	}

}
