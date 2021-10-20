package com.nttdata.bootcamp.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//import com.nttdata.bootcamp.saludoIdioma.Saludo;

@SpringBootApplication
@EnableAutoConfiguration
public class StarterApplication {

	public static void main(String[] args) {
		SpringApplication.run(StarterApplication.class, args);

//		 Saludo saludo = new Saludo("Italiano");
//		System.out.println(saludo.mensajeSaludo());

	}

}
