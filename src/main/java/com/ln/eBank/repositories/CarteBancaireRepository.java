package com.ln.eBank.repositories;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ln.eBank.entities.CarteBancaire;

public interface CarteBancaireRepository extends JpaRepository<CarteBancaire, Long> {
	//Page<CarteBancaire> findByIdClient(long idClient, Pageable pageable);

	//Optional<CarteBancaire> findByIdAndIdClient(long id, long clientId);
}
