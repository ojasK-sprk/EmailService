package com.user.test;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import com.user.test.entity.EmailDetails;
import com.user.test.service.EmailService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEncryptableProperties
public class EmailServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(EmailServiceApplication.class, args);
	}

}
