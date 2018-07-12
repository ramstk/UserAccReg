package com.example.UserAccReg;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.model.UserRegistration;
import com.example.repository.UserRegRepo;

@SpringBootApplication
@EnableAutoConfiguration
public class UserRegApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserRegApplication.class, args);
	}
	
//	@Bean
//	public CommandLineRunner setup(UserRegRepo userRegRepo) {
//		return (args) -> {
//			userRegRepo.save(new UserRegistration("Ram",  "STK",  "RamSTK", "ramstk@test.com", "Test@123" , "Test@123", true));
//		
//			
//		};
//	}
}
