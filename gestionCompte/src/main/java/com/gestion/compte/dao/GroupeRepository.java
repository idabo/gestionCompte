package com.gestion.compte.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestion.compte.entities.Groupe;

public interface GroupeRepository extends JpaRepository<Groupe,Long>{

}
