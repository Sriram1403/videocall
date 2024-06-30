package com.sriram.videocall;

import com.sriram.videocall.Model.User;
import com.sriram.videocall.Service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VideocallApplication {

	public static void main(String[] args) {
		SpringApplication.run(VideocallApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(
			UserService service
	){
		return args -> {

			service.register(User.builder()
							.username("Sriram")
							.email("sriramtcu@gmail.com")
							.password("sri")
					.build());

			service.register(User.builder()
					.username("Jeeva")
					.email("jeeva@gmail.com")
					.password("jeeva")
					.build());

			service.register(User.builder()
					.username("sandy")
					.email("sandy@gmail.com")
					.password("sandy")
					.build());
		};
	}
}
