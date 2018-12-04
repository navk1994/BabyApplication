package com.gareth.persistence.domain;

public class Babies {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Babies(){}

	public Babies(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Babies [Name=" + name + "]";
	}
	
	
}
