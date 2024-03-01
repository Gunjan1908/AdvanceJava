package com.app;

public class Heart {

	private String nameofAnimal;
	private int noOfHearts;
	
	public Heart() {}

	public void setNameofAnimal(String nameofAnimal) {
		this.nameofAnimal = nameofAnimal;
	}

	public void setNoOfHearts(int noOfHearts) {
		this.noOfHearts = noOfHearts;
	}

	public String getNameofAnimal() {
		return nameofAnimal;
	}

	public int getNoOfHearts() {
		return noOfHearts;
	}

	public void pump() {
		System.out.println("You are Alive!!!");
		System.out.println("Your heart is Pumping!!!");
	}

}
