package com.zcorp.medversant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.config.EnableWebFlux;

@SpringBootApplication
@EnableWebFlux
public class MedversantApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedversantApplication.class, args);
	}

}
