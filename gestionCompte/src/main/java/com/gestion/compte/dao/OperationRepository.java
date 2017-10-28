package com.gestion.compte.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestion.compte.entities.Operation;

public interface OperationRepository extends JpaRepository<Operation,Long>{

}
