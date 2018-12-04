package com.gareth.util;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class LetterGenerator {
	
	public String letterGenerator(int numberOfLetters) 
	{
		String phrase = "";
		final String alphabet = "abdehilnorstuy";
		final int N = alphabet.length();
		
		
		Random r = new Random();
		
		for(int i = 0; i < 10; i++) 
		{
			if(phrase.length() < numberOfLetters) 
			{
				phrase += alphabet.charAt(r.nextInt(N));
			}
		}
		return phrase;
	}
}
