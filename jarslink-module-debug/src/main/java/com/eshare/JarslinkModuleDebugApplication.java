package com.eshare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com")
public class JarslinkModuleDebugApplication {

	public static void main(String[] args) {
		SpringApplication.run(JarslinkModuleDebugApplication.class, args);
	}
}
