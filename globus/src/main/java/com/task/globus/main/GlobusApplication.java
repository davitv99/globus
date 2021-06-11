package com.task.globus.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@ComponentScan(basePackages = {"com.task.globus"})
@EntityScan("com.task.globus.model")
@EnableAsync
public class GlobusApplication {

	public static void main(String[] args) {
		SpringApplication.run(GlobusApplication.class, args);
	}

}
