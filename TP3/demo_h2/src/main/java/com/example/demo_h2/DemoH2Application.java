package com.example.demo_h2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo_h2.entities.Adherent;
import com.example.demo_h2.repository.AdherentRepository;

@SpringBootApplication
public class DemoH2Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoH2Application.class, args);
	}

	@Bean
	CommandLineRunner runner(AdherentRepository repository) {
		return args -> {
			repository.save(new Adherent(null, "A", "B", 29));
			repository.save(new Adherent(null, "A", "B", 29));
			repository.save(new Adherent(null, "A", "B", 29));
			repository.save(new Adherent(null, "A", "B", 29));
		};
	}
}
