package tn.esprit.gestionmagasin;

import java.util.stream.Stream;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import tn.esprit.gestionmagasin.entity.Facture;
import tn.esprit.gestionmagasin.repository.FactureRepository;

@SpringBootApplication
@EnableEurekaClient
public class GestionfactureApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionfactureApplication.class, args);
	}
	
	@Bean
    ApplicationRunner init(FactureRepository repository) {
        return args -> {
            Stream.of("ff2ed", "gg58h", "ax21c" , "S-OMO").forEach(libelle -> {
                repository.save(new Facture(libelle));
            });
            repository.findAll().forEach(System.out::println);
        };
    }

}
