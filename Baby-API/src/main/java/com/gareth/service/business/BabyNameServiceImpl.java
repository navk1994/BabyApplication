package com.gareth.service.business;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gareth.persistence.domain.Baby;
import com.gareth.persistence.repository.BabyNameRepository;
import com.gareth.service.external.APICaller;

@Service
public class BabyNameServiceImpl implements BabyNameService {

	@Autowired
	private BabyNameRepository babyRepo;

	@Autowired
	private APICaller external;

	public void setRepo(BabyNameRepository persist) {
		this.babyRepo = persist;

	}
	
	public Optional<Baby> get(Long id)
	{
		return babyRepo.findById(id);
	}

	public Iterable<Baby> getAll() {
		return babyRepo.findAll();
	}

	public Baby addBabyName(Baby baby) {
		baby.setName(external.getBabyName());

		external.persist(baby);
		return babyRepo.save(baby);
	}

}
