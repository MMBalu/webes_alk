package com.example.ora3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.example.ora3.repository")
public class Ora3Application {

	public static void main(String[] args) {
		SpringApplication.run(Ora3Application.class, args);
	}

}
