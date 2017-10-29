package com.gestion.compte.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.compte.dao.ClientRepository;
import com.gestion.compte.entities.Client;

@Service
public class ClientMetierImpl implements ClientMetier{
	
	@Autowired
	private ClientRepository clientRepository;

	@Override
	public Client addClient(Client c) {
		// TODO Auto-generated method stub
		return clientRepository.save(c);
	}

	@Override
	public List<Client> listClient() {
		// TODO Auto-generated method stub
		return clientRepository.findAll();
	}

	@Override
	public List<Client> clientParMC(String mc) {
		// TODO Auto-generated method stub
		return clientRepository.clientsParMC(mc);
	}

}
