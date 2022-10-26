package tn.esprit.gestionmagasin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication

@EnableEurekaClient
public class Gateway1Application {

	public static void main(String[] args) {
		SpringApplication.run(Gateway1Application.class, args);
	}

}
