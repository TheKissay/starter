package com.nttdata.bootcamp.starter;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nttdata.bootcamp.saludoIdioma.Saludo;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;

@Configuration
@ConditionalOnClass(Saludo.class)
@EnableConfigurationProperties(SaludoProperties.class)

public class SaludoAutoconfigure {

	private final SaludoProperties properties;
	
	
	public SaludoAutoconfigure (SaludoProperties properties) {
		this.properties = properties;
	}
	
	@Bean
	public Saludo saludo() {
		return new Saludo(properties.getIdioma());
	}
	
	
}
