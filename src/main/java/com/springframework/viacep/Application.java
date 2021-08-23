package com.springframework.viacep;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.springframework.viacep.model.Address;
import com.springframework.viacep.repository.AddressRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(AddressRepository repository) {
		return (args) -> {
			repository.save(new Address("01001000", "Praça da Sé"));
			repository.save(new Address("94935410", "Rua Lídio Batista Soares"));
			repository.save(new Address("90010170", "Praça Montevidéo"));	
		};
	}

}
