package com.kruger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * 
 * @author Gustavo Parco
 *
 */
@SpringBootApplication
public class InvacappBackendApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(InvacappBackendApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(InvacappBackendApplication.class);
	}
}
