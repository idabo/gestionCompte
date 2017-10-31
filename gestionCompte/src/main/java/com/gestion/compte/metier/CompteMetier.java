package com.gestion.compte.metier;

import com.gestion.compte.entities.Compte;

public interface CompteMetier{
	
	public Compte saveCompte(Compte cp);
	public Compte getCompte(String code);

}
