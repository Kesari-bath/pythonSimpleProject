package com.digital.nanda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class NandaTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(NandaTestApplication.class, args);
	}
	
	@GetMapping("/helo")
	public String hello() {
		return "hello";
	}

}
