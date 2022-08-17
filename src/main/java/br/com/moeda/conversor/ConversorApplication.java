package br.com.moeda.conversor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@AutoConfiguration
public class ConversorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConversorApplication.class, args);
	}

}
