package com.gareth.persistence.domain;

public class BabyName {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public BabyName() {}
	
	public BabyName(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Baby Name [Name=" + name + "]";
	}
	
}
