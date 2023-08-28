package com.email.hystrics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping
public class EmailServiceForHystrixApplication {
	
	@GetMapping("/email")
	public String email()
	{
		return " Email Service Called";
	}

	public static void main(String[] args) {
		SpringApplication.run(EmailServiceForHystrixApplication.class, args);
	}

}
