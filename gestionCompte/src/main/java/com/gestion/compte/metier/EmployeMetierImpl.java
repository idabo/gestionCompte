package com.gestion.compte.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.compte.dao.EmployeRepository;
import com.gestion.compte.entities.Employe;

@Service
public class EmployeMetierImpl implements EmployeMetier{
	@Autowired
	private EmployeRepository employeRepository;

	@Override
	public Employe saveEmploye(Employe e) {
		// TODO Auto-generated method stub
		return employeRepository.save(e);
	}

	@Override
	public List<Employe> listEmployes() {
		// TODO Auto-generated method stub
		return employeRepository.findAll();
	}

}
