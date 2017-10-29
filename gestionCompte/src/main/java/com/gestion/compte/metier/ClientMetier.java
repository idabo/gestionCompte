package com.gestion.compte.metier;

import java.util.List;

import com.gestion.compte.entities.Client;

public interface ClientMetier {
	
	public Client addClient(Client c);
	public List<Client> listClient();
	public List<Client> clientParMC(String mc);

}
