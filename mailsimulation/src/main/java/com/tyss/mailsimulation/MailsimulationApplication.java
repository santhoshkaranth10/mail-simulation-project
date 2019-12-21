package com.tyss.mailsimulation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.tyss.mailsimulation"})

public class MailsimulationApplication {

	public static void main(String[] args) {
		SpringApplication.run(MailsimulationApplication.class, args);
	}

}
