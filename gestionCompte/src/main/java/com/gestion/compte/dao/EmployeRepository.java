package com.gestion.compte.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestion.compte.entities.Employe;

public interface EmployeRepository extends JpaRepository<Employe,Long>{

}
