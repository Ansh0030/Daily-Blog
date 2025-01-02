package com.channelblog.dailyblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class DailyblogApplication {

	public static void main(String[] args) {
		SpringApplication.run(DailyblogApplication.class, args);
	}

}
