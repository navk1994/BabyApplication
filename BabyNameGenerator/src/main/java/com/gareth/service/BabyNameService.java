package com.gareth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gareth.util.LetterGenerator;
import com.gareth.util.NameGenerator;

@Service
public class BabyNameService implements IBabyNameService {

	@Autowired
	NameGenerator nameGenerator;
	
	@Autowired
	LetterGenerator letterGenerator;
	
	
	public String generateBabyName() 
	{
		return nameGenerator.nameGenerator() + letterGenerator.letterGenerator(3);
	}
	
}
