package com.scaler.arun;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class EcommerceWebApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(EcommerceWebApplication.class, args);

		List<String > beans= List.of(context.getBeanDefinitionNames());
		System.out.println("Total beans: "+beans.size());
		for(String bean:beans){
			System.out.println("bean:"+bean);
		}
	}



}
