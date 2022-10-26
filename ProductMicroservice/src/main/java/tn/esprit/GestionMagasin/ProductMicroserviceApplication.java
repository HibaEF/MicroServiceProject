package tn.esprit.GestionMagasin;

import java.util.stream.Stream;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import tn.esprit.GestionMagasin.Repositeries.ProduitRepository;
import tn.esprit.GestionMagasin.entities.Produit;

@SpringBootApplication
@EnableEurekaClient
public class ProductMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductMicroserviceApplication.class, args);
	}
	@Bean
	ApplicationRunner init(ProduitRepository repository) {
		return args -> {
			Stream.of("Mariem","Hiba","Oumayma").forEach(Libelle -> {
				repository.save(new Produit(Libelle));
			});
			repository.findAll().forEach(System.out::println);
		};
	}

}
/*ApplicationRunner init(DetailProduitRepository repository) {
return args -> {
	Stream.of("22-02-2022","02-02-1998","20-11-2021").forEach(dateCreation -> {
		repository.save(new DetailProduit(dateCreation));
	});
	repository.findAll().forEach(System.out::println);
};
}*/