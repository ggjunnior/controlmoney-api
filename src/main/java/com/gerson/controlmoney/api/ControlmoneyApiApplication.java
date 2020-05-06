package com.gerson.controlmoney.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.gerson.controlmoney.api.config.property.ControlMoneyApiProperty;

@SpringBootApplication
@EnableConfigurationProperties(ControlMoneyApiProperty.class)
public class ControlmoneyApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControlmoneyApiApplication.class, args);
	}

}
