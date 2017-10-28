package com.gestion.compte.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Groupe implements Serializable{
	@Id
	@GeneratedValue
	private Long numGroupe;
	private String nomGroupe;
	@ManyToMany(mappedBy = "groupes")
	private Collection<Employe> employes;
	public Groupe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Groupe(String nomGroupe) {
		super();
		this.nomGroupe = nomGroupe;
	}
	public Groupe(Long numGroupe, String nomGroupe, Collection<Employe> employes) {
		super();
		this.numGroupe = numGroupe;
		this.nomGroupe = nomGroupe;
		this.employes = employes;
	}
	public Long getNumGroupe() {
		return numGroupe;
	}
	public void setNumGroupe(Long numGroupe) {
		this.numGroupe = numGroupe;
	}
	public String getNomGroupe() {
		return nomGroupe;
	}
	public void setNomGroupe(String nomGroupe) {
		this.nomGroupe = nomGroupe;
	}
	public Collection<Employe> getEmployes() {
		return employes;
	}
	public void setEmployes(Collection<Employe> employes) {
		this.employes = employes;
	}
	
	

}
