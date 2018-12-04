package com.gareth.persistence.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Baby {
	private String name;
	
	@Id
	private String babyID;
	@OneToOne(cascade = CascadeType.ALL)

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	public String getBabyID() {
		return babyID;
	}

	public void setBabyID(String babyID) {
		this.babyID = babyID;
	}

	public Baby() {}
	
	public Baby(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Baby Name [Name=" + name + "]";
	}
	
}
