package com.gareth.service.business;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.gareth.persistence.domain.Baby;
import com.gareth.persistence.repository.BabyNameRepository;

@Service
public interface BabyNameService {

	void setRepo(BabyNameRepository persist);

	Optional<Baby> get(Long id);
	
	Iterable<Baby> getAll();
	

	Baby addBabyName(Baby baby);

}