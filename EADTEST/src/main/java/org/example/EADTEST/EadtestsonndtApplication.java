package org.example.EADTEST;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class EadtestsonndtApplication {

	public static void main(String[] args) {
		SpringApplication.run(EadtestsonndtApplication.class, args);
	}
}
