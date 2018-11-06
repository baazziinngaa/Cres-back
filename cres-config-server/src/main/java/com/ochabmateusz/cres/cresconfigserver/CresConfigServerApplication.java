package com.ochabmateusz.cres.cresconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CresConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CresConfigServerApplication.class, args);
	}
}
