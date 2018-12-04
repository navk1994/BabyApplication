package com.gareth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

import com.gareth.util.LetterGenerator;
import com.gareth.util.NameGenerator;

@SpringBootApplication
//@ComponentScan({"com.delivery.request"})
public class BabyNameGeneratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(BabyNameGeneratorApplication.class, args);
		
		LetterGenerator letterGen = new LetterGenerator();
		NameGenerator nameGen = new NameGenerator();
//		System.out.println(nameGen.nameGenerator("bob") + letterGen.letterGenerator(2));
		
		System.out.println(nameGen.nameGenerator() + letterGen.letterGenerator(2) );
	}
	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
}
