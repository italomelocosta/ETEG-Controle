package com.novo.eteg.italoeteg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = com.novo.eteg.italoeteg.controller.PacienteController.class)
public class ItaloetegApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItaloetegApplication.class, args);
	}
}
