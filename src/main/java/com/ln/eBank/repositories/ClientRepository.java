package com.ln.eBank.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ln.eBank.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

	Client findByEmail(String email);

}
