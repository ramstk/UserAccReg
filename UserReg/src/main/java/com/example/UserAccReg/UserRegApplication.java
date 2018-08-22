package com.example.UserAccReg;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.model.UserRegistration;
import com.example.repository.UserRegRepo;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan({ "com.example.*" })
@EnableJpaRepositories(basePackages = {"com.example.*"})
@EntityScan("com.example.*")
public class UserRegApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserRegApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner setup(UserRegRepo userRegRepo) {
		return (args) -> {
			userRegRepo.save(new UserRegistration("Ram",  "STK",  "RamSTK", "ramstk@test.com", "Test@123" , "Test@123", true));
		
			
		};
	}
}
