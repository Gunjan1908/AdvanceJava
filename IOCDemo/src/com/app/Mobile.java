package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
	
	public static void main(String[] args) {
		
		/*
		 * Vodafone voda = new Vodafone();
		 *  voda.calling(); 
		 *  voda.data();
		 */
		
		/*
		 * Jio jio = new Jio();
		 *  jio.calling(); 
		 *  jio.data();
		 */
		
		/*
		 * Sim sim = new Jio(); 
		 * sim.calling(); 
		 * sim.data();
		 */
		
		/*
		 * ApplicationContext context = new
		 * ClassPathXmlApplicationContext("applicationContext.xml"); 
		 * Vodafone v =(Vodafone)context.getBean("voda");
		 *  v.calling();
		 *   v.data();
		 */
	
		ApplicationContext context = new
			 ClassPathXmlApplicationContext("applicationContext.xml");
		Sim s = context.getBean("sim",Sim.class);
		s.calling();
		s.data();
	}
}
