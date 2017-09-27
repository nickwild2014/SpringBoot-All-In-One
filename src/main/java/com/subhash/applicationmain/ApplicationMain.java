package com.subhash.applicationmain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication // combination of below three
/*
 * //@Configuration @EnableAutoConfiguration @ComponentScan
 */

@EnableScheduling
@ComponentScan("com.subhash.scheduledtask")
public class ApplicationMain {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationMain.class, args);
	}
}
