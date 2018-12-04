package com.gareth.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gareth.persistence.domain.Baby;

@Repository
public interface BabyNameRepository extends JpaRepository<Baby, Long>  {
	
}
