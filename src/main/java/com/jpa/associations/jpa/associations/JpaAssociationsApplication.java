package com.jpa.associations.jpa.associations;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaAssociationsApplication  implements CommandLineRunner {
	/*
	di repository
	use save method
	store produit
	store order lIne with order_id and produit_id
	store Order header
	 */

	public static void main(String[] args) {
		SpringApplication.run(JpaAssociationsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {



	}
}
