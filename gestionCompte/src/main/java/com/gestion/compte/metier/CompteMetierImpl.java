package com.gestion.compte.metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.compte.dao.CompteRepository;
import com.gestion.compte.entities.Compte;

@Service
public class CompteMetierImpl implements CompteMetier{
	@Autowired
	private CompteRepository compteRepository;

	@Override
	public Compte saveCompte(Compte cp) {
		// TODO Auto-generated method stub
		return compteRepository.save(cp);
	}

	@Override
	public Compte getCompte(String code) {
		// TODO Auto-generated method stub
		return compteRepository.findOne(code);
	}

}
