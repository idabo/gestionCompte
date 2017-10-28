package com.gestion.compte.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestion.compte.entities.Client;

public interface ClientRepository extends JpaRepository<Client,Long>{

}
