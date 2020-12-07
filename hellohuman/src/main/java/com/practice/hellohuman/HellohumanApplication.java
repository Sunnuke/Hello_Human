package com.practice.hellohuman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HellohumanApplication {

	public static void main(String[] args) {
		SpringApplication.run(HellohumanApplication.class, args);
	}
	@RequestMapping("/")
	public String code1(@RequestParam(value="x", required=false) String test) {
		if (test != null) {
			return "Hello " + test + "! Welcome to the Grid!";
		}
		return "Hello Human! Welcome to the Grid!";
	}

}
