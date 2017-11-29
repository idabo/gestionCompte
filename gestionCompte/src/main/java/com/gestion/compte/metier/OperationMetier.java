package com.gestion.compte.metier;

import java.util.List;

import com.gestion.compte.entities.Operation;

public interface OperationMetier {
	
	public boolean verser(String code,double montant,Long codeEmp);
	public boolean retirer(String code,double montant,Long codeEmp);
	public boolean virement(String cpte1,String cpte2,double montant,Long codeEmp);
	public List<Operation> listOperations();
}
