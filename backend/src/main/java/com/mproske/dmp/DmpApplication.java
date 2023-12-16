package com.mproske.dmp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.mproske.dmp.model")
public class DmpApplication {

	public static void main(String[] args) {
		SpringApplication.run(DmpApplication.class, args);
	}
}
