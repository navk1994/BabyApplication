package com.gareth.util;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class NameGenerator {

	public String nameGenerator() {
		String[] names = {"Alvin", "Peter", "Harry", "Tadas", "Graham"};
		
		Random r = new Random();
		
		return names[r.nextInt(4)];
	}
}
