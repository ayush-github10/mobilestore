package com.sopra.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@SpringBootApplication
//@OpenAPIDefinition(
//		info = @Info(
//				title = "MobileApp",
//				version = "1.0.2",
//				description = "Mobile Description Services",
//				contact = @Contact (name = "Ayush", email = "ayush.yadav@sopra.com"),
//				license = @License (name = "License", url = "www.gsmarena.com")
//				)
//		)
public class MicroservicesmobilestoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesmobilestoreApplication.class, args);
	}

}
