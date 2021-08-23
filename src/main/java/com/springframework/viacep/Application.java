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
			repository.save(new Address("01001000", "Pra�a da S�"));
			repository.save(new Address("94935410", "Rua L�dio Batista Soares"));
			repository.save(new Address("90010170", "Pra�a Montevid�o"));	
		};
	}

}
