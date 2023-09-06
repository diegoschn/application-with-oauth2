package com.diegoschneider.applicationoauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ApplicationOauth2Application {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationOauth2Application.class, args);
	}

	@RestController
	class HttpController {
		@GetMapping("/public")
		String publicRoute(){
			return "<h1> Public route, feel free to look around!";
		}

		@GetMapping("/private")
		String privateRoute(){
			return "<h1> Private route, only authorized personal!";
		}
	}

}
