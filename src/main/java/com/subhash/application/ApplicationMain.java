package com.subhash.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

/* @SpringBootApplication is combination of below three
 * @Configuration @EnableAutoConfiguration @ComponentScan
 */
@SpringBootApplication
@EnableScheduling
// @ComponentScan("com.subhash.scheduledtask")
public class ApplicationMain extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(ApplicationMain.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ApplicationMain.class);
	}
}
