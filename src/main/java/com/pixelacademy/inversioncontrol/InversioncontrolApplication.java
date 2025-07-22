package com.pixelacademy.inversioncontrol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
		scanBasePackages = {"com.pixelacademy.inversioncontrol," + "util"}
)
public class InversioncontrolApplication {

	public static void main(String[] args) {
		SpringApplication.run(InversioncontrolApplication.class, args);
	}

}
