package com.upn.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class ProySpringApplication implements CommandLineRunner {
	private static Logger logger = LoggerFactory.getLogger(ProySpringApplication.class);


	public static void main(String[] args) {

		SpringApplication.run(ProySpringApplication.class, args);		

	}
	@Override

	public void run(String... args) throws Exception {

		//System.out.println("Trabajando con una aplicacion usando Spring");

		logger.info("Aplicacion con Spring, este es un mensaje informativo");
		logger.warn("Aplicacion con Spring, este es un mensaje de alarma");
		logger.error("Aplicacion con Spring, este es un mensaje de error");

	}

}
