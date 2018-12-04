package com.gareth.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gareth.persistence.domain.Baby;
import com.gareth.service.business.BabyNameService;

@CrossOrigin
@RequestMapping("/babies")
@RestController
public class BabyNameEndpoint {

@Autowired 
private BabyNameService service;

@GetMapping("/getbabyname")
public Optional<Baby> getBabyName(@PathVariable Long ID)
{
return service.get(ID);
}

@PostMapping("/addbabyname")
public Baby addBaby(@RequestBody Baby baby) 
{
return service.addBabyName(baby);	
}



	
}
