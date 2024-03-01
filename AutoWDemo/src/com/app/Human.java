package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	
	//@Autowired
	//@Qualifier("octupusHeart")
	Heart heart;
 
	public Human() {
		System.out.println("Human Constructor");
	}

	//@Autowired
	//@Qualifier("humanHeart") /*--> cannot be applied to constructor*/
	public Human(Heart heart) {
		super();
		System.out.println("In Constructor---->");
		this.heart = heart;
	}

	
	@Autowired
	@Qualifier("humanHeart")
	public void setHeart(Heart heart) {
		System.out.println("In Setter----->");
		this.heart = heart;
	}
	
	public void pumping()
	{
		if(heart!=null)
		{
		heart.pump();
		System.out.println("Animal Name = "+heart.getNameofAnimal()+
				" No.of Heart = "+heart.getNoOfHearts());
		}
		else
		{
			System.out.println("You are Dead!!!");
		}
	}

}
