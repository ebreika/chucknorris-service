package org.waybe.demo.chucknorrisservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ChucknorrisServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChucknorrisServiceApplication.class, args);
	}
}
