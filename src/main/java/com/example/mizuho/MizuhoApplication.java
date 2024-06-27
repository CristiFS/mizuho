package com.example.mizuho;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class MizuhoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MizuhoApplication.class, args);
	}

}
