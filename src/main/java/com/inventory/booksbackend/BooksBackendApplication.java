package com.inventory.booksbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
@Component
public class BooksBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BooksBackendApplication.class, args);
	}

}
