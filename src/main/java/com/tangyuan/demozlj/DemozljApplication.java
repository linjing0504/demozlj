package com.tangyuan.demozlj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.tangyuan.demozlj"})
public class DemozljApplication {

	public static void main(String[] args) {
		System.out.print("hello....");
		SpringApplication.run(DemozljApplication.class, args);
		System.out.print("hello..end..");
	}

}
