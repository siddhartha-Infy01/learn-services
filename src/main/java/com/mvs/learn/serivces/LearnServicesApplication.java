package com.mvs.learn.serivces;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

import de.codecentric.boot.admin.config.EnableAdminServer;

@Configuration
@SpringBootApplication
@EnableAdminServer
@EnableAutoConfiguration
public class LearnServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnServicesApplication.class, args);
	}
}
