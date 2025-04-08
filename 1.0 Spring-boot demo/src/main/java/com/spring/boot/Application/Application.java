package com.spring.boot.Application;

import com.spring.boot.Application.rest.FunRestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		FunRestController fc= new FunRestController();
		SpringApplication.run(Application.class, args);
		System.out.println(fc.toString());
	}

}
