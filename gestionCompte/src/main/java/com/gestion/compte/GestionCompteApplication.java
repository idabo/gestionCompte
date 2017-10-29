package com.gestion.compte;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.gestion.compte.entities.Client;
import com.gestion.compte.metier.ClientMetier;

@SpringBootApplication
public class GestionCompteApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(GestionCompteApplication.class, args);
		ClientMetier clientMetier=ctx.getBean(ClientMetier.class);
		clientMetier.addClient(new Client("dabo"));
		clientMetier.addClient(new Client("sylla"));
		clientMetier.addClient(new Client("ba"));
		
		System.out.println("----------------------");
		List<Client> clients=clientMetier.listClient();
		clients.forEach(c->System.out.println(c.getNom()));
		System.out.println("----------------------");
		List<Client> clts=clientMetier.clientParMC("%a%");
		clts.forEach(c->System.out.println(c.getNom()));
	
	}
}
