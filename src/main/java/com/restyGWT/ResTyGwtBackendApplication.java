package com.restyGWT;

import org.dozer.DozerBeanMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ResTyGwtBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResTyGwtBackendApplication.class, args);
	}

	@Bean
	public DozerBeanMapper mapper() {
		return new DozerBeanMapper();
	}
}
