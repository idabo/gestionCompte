package com.gestion.compte;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.gestion.compte.entities.Client;
import com.gestion.compte.metier.ClientMetier;

@SpringBootApplication
public class GestionCompteApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(GestionCompteApplication.class, args);
/*		ClientMetier clientMetier=ctx.getBean(ClientMetier.class);
		clientMetier.addClient(new Client("dabo"));
		clientMetier.addClient(new Client("sylla"));
		clientMetier.addClient(new Client("ba"));*/
	}
}
