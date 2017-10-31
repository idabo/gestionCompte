package com.gestion.compte.metier;

import java.util.List;

import com.gestion.compte.entities.Employe;

public interface EmployeMetier {
	
	public Employe saveEmploye(Employe e);
	public List<Employe> listEmployes();

}
