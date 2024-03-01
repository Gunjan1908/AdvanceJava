package com.app.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.aopdemo.dao.AccountDAO;
import com.app.aopdemo.dao.MembershipDAO;

public class MainDemo {
	
	public static void main(String[] args) {
		//read spring config class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(DemoConfig.class);
		//get the bean from the Spring Container
		AccountDAO theDAO = context.getBean("bean1",AccountDAO.class);
		MembershipDAO memDAO = context.getBean("bean2",MembershipDAO.class);
		
		theDAO.addAccount();
		memDAO.addAccount();
		memDAO.addSilly();
		theDAO.doWork(10,20);
		//close the context
		context.close();
	}

}
