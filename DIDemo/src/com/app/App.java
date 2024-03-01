package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {	
		ApplicationContext context =
				new ClassPathXmlApplicationContext("beans.xml");
		Human h = context.getBean("human",Human.class);
		h.pumping();		
	}
}


/*
 * AutoWiring: Injecting value for object depenedency Implicitly 
 * Cannot be applied for String and Primitives.
 * @AutoWired
 */








