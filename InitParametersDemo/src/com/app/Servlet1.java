package com.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private String dname,uname,pwd,msg;
	private double irate;
	private ServletConfig config;
	
    @Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		 System.out.println("In Init() method");
		 config = getServletConfig();
		dname = config.getInitParameter("driverName");
		irate = Double.parseDouble(config.getInitParameter("intRate"));
		ServletContext context = getServletContext();
		msg = context.getInitParameter("commonMsg");
	}

	/**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("In doGet() ");
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		/*
		 * pw.write("<h2> Driver name = "+dname+"</h2>");
		 * pw.write("<br><h2> IntRate = "+irate+"</h2>");
		 */
		pw.write("<br><h2> Message = "+msg+"</h2>");
		
		
		Enumeration<String> e = config.getInitParameterNames();
		String str="";
		pw.write("<h1>Parameter Initalization in Servlet</h1>");
		while(e.hasMoreElements())
		{
			str = e.nextElement();
			pw.write("<br>Parameter Name = "+str);
			pw.write("  Parameter Value = "+config.getInitParameter(str));
		}	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
