package com.unir.peliculas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;



@EnableDiscoveryClient
@SpringBootApplication
public class ServicioPeliculaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicioPeliculaApplication.class, args);
	}

}
