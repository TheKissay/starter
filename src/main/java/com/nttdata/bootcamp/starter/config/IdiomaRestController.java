package com.nttdata.bootcamp.starter.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bootcamp.saludoIdioma.SaludoProperties;


@RestController
@RequestMapping("/api")
public class IdiomaRestController {

	@Autowired
	SaludoProperties s;

	@GetMapping("/saludo")
	public String getSaludo() {
		System.out.println(s.getIdioma());
		return s.getIdioma();
	}


}
