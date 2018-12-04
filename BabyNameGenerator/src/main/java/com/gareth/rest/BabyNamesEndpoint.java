package com.gareth.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gareth.service.IBabyNameService;

@RestController
public class BabyNamesEndpoint {

	@Autowired
	IBabyNameService service;

	@RequestMapping("/generate")
	public String babyName() {

		return service.generateBabyName();
	}

	@GetMapping("/test")
	public String testMethod() {
		return "The API is working";
	}

}
