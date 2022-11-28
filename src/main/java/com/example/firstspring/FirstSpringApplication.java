package com.example.firstspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class FirstSpringApplication {
	@RequestMapping("/hello")
	String hello()
	{
		return "Hello, world!";
	}
	// добавить класс тест контроллер,  на запрос /test отвечает "<h1>Its a test!</h1>"

	public static void main(String[] args) {

		SpringApplication.run(FirstSpringApplication.class, args);
	}

}
