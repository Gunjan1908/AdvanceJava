package com.app.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.dao.EmployeeDao;
import com.app.model.Employee;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServlet() {
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
		
		String name = request.getParameter("empName");
		String pwd = request.getParameter("empPwd");
		String email = request.getParameter("empEmail");
		String phno = request.getParameter("empPhno");
		
		Employee e = new Employee();
		e.setEmpName(name);
		e.setEmpPwd(pwd);
		e.setEmpEmail(email);
		e.setEmpPhno(phno);
		
		int ans = 0;
		
		ans = EmployeeDao.empAdd(e);
		
		if(ans > 0)
		{
			pw.write("Registration Done!!!");
			request.getRequestDispatcher("index.html")
			.include(request, response);
		}
		else
		{
			pw.write("Registration Failed!!!");
			request.getRequestDispatcher("register.html")
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
