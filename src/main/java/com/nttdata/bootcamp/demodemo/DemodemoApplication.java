package com.nttdata.bootcamp.demodemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.bootcamp.saludoIdioma.Saludo;


@SpringBootApplication
public class DemodemoApplication {

	public static void main(String[] args) {
//		SpringApplication.run(Starter2Application.class, args);
		//Saludo saludo = new Saludo("Ingles");
//		System.out.println(saludo.mensajeSaludo());
//		saludo.setIdioma("Castellano");
		//System.out.println(saludo.mensajeSaludo());
		System.out.println("Starter");
		Saludo saludo = new Saludo("Español");
		System.out.println(saludo.mensajeSaludo());
	}

}
