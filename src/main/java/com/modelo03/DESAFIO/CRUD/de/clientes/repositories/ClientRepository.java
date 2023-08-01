package com.modelo03.DESAFIO.CRUD.de.clientes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.modelo03.DESAFIO.CRUD.de.clientes.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
