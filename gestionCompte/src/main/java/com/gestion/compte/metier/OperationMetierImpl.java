package com.gestion.compte.metier;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gestion.compte.dao.CompteRepository;
import com.gestion.compte.dao.EmployeRepository;
import com.gestion.compte.dao.OperationRepository;
import com.gestion.compte.entities.Compte;
import com.gestion.compte.entities.Employe;
import com.gestion.compte.entities.Operation;
import com.gestion.compte.entities.Versement;

@Service
public class OperationMetierImpl implements OperationMetier{
	@Autowired
	private OperationRepository operationRepository;
	@Autowired
	private CompteRepository compteRepository;
	@Autowired
	private EmployeRepository employeRepository;

	@Override
	@Transactional
	public boolean verser(String code, double montant, Long codeEmp) {
		// TODO Auto-generated method stub
		Compte cp=compteRepository.findOne(code);
		Employe e=employeRepository.findOne(codeEmp);
		Operation o=new Versement();
		o.setDateOperation(new Date());
		o.setMontant(montant);
		o.setCompte(cp);
		o.setEmploye(e);
		operationRepository.save(o);
		cp.setSolde(cp.getSolde()+montant);
		return true;
	}

	@Override
	@Transactional
	public boolean retirer(String code, double montant, Long codeEmp) {
		// TODO Auto-generated method stub
		Compte cp=compteRepository.findOne(code);
		if(cp.getSolde() < montant) throw new RuntimeException("Solde insufisant");
		Employe e=employeRepository.findOne(codeEmp);
		Operation o=new Versement();
		o.setDateOperation(new Date());
		o.setMontant(montant);
		o.setCompte(cp);
		o.setEmploye(e);
		operationRepository.save(o);
		cp.setSolde(cp.getSolde()-montant);
		return true;
	}

	@Override
	@Transactional
	public boolean virement(String cpte1, String cpte2, double montant, Long codeEmp) {
		// TODO Auto-generated method stub
		retirer(cpte1,montant,codeEmp);
		verser(cpte2,montant,codeEmp);
		return true;
	}

}
