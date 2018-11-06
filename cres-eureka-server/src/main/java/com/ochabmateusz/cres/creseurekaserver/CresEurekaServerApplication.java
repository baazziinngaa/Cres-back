package com.ochabmateusz.cres.creseurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CresEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CresEurekaServerApplication.class, args);
	}
}
