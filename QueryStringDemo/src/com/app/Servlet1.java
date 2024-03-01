package com.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/s1")
public class Servlet1 extends GenericServlet implements Servlet {
	private static final long serialVersionUID = 1L;
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		String name = request.getParameter("txtName");
		//String no = request.getParameter("txtAge");
		int age = Integer.parseInt(request.getParameter("txtAge"));
		
		if(age>18)
			pw.write("Eligible for Voting!!!! "+name);
		else
			pw.write("Not Eligible for Voting!!!! "+name);	
	}
}


//http://localhost:8080/QueryStringDemo/s1?txtName=rahul&txtAge=10
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

