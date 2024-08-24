package com.Nahudev.eurekaServerE_comerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerEComerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerEComerceApplication.class, args);
	}

}
