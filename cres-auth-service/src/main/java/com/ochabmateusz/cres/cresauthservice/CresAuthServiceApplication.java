package com.ochabmateusz.cres.cresauthservice;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.CrossOrigin;

@EnableJpaRepositories
@EnableEurekaClient
@SpringBootApplication
public class CresAuthServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CresAuthServiceApplication.class, args);
	}
}
