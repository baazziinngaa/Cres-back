package com.ochabmateusz.cres.cresregisterusermicr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
@EnableDiscoveryClient
@EnableEurekaClient
@EnableFeignClients("com.ochabmateusz.cres.cresregisterusermicr")
public class CresRegisterUserMicrApplication {

	public static void main(String[] args) {
		SpringApplication.run(CresRegisterUserMicrApplication.class, args);
	}
}
