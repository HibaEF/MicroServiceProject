package com.example.atelier2;

import com.example.atelier2.Entity.Stock;
import com.example.atelier2.Repository.StockRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
@EnableEurekaClient
public class Atelier2Application {

    public static void main(String[] args) {
        SpringApplication.run(Atelier2Application.class, args);
    }

    @Bean
    ApplicationRunner init(StockRepository repository) {
        return args -> {
            Stream.of("S-delice", "S-Saida", "S-Vitalait" , "S-OMO").forEach(libelleStock -> {
                repository.save(new Stock(libelleStock));
            });
            repository.findAll().forEach(System.out::println);
        };
    }
}
