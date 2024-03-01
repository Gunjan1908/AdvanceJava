package com.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		request.getRequestDispatcher("index.html").include(request, response);
		
		String uname = request.getParameter("txtUsername");
		String pwd = request.getParameter("txtPassword");
		
		if(uname.equals("admin")&&pwd.equals("admin123"))
		{
			
			HttpSession session = request.getSession();
			session.setAttribute("user", uname);
			session.setAttribute("pass", pwd);
			pw.write("Successfully Logged In");
		}
		else
		{
			pw.write("Invalid Username of PassWord!!!");
			request.getRequestDispatcher("login.html").include(request, response);
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
