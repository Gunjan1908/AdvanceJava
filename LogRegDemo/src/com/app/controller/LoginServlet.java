package com.app.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.dao.EmployeeDao;
import com.app.model.Employee;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String name = request.getParameter("txtUsername");
		String pwd = request.getParameter("txtPassword");
		Employee e = new Employee();
		e.setEmpName(name);
		e.setEmpPwd(pwd);
		boolean status=false;
		try {
			 status = EmployeeDao.validate(e);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		if(status == true)
		{
			pw.write("Login Successfull!!!");
			request.getRequestDispatcher("index.html")
			.include(request, response);
		}
		else
		{
			pw.write("Invalid Username or Password!!");
			request.getRequestDispatcher("index.html")
			.include(request, response);
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
