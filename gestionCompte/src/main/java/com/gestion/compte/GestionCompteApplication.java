package com.gestion.compte;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class GestionCompteApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(GestionCompteApplication.class, args);
	}
}
