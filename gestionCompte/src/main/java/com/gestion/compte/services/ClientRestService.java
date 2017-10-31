package com.gestion.compte.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.compte.entities.Client;
import com.gestion.compte.metier.ClientMetier;

@RestController
public class ClientRestService {
	@Autowired
	private ClientMetier clientMetier;
    @RequestMapping(value="/clients",method=RequestMethod.POST)
	public Client addClient(@RequestBody Client c) {
		return clientMetier.addClient(c);
	}
    @RequestMapping(value="/clients",method=RequestMethod.GET)
	public List<Client> listClient() {
		return clientMetier.listClient();
	}

	public List<Client> clientParMC(String mc) {
		return clientMetier.clientParMC(mc);
	}
	

}
