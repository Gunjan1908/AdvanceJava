package com.app.dao;

import java.sql.*;
import com.app.model.Employee;

public class EmployeeDao {
	
	public static Connection getConnection() throws SQLException
	{
		Connection con = null;
		try {
			//register the Driver
			Class.forName("com.mysql.jdbc.Driver");
			//System.out.println("Driver Found");
			//Establish the Connection
	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db",
			"root", "");
			//System.out.println("Connection Established");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;	
	}
	
	public static int empAdd(Employee e)
	{
		int i = 0 ;
		try {
			Connection con = EmployeeDao.getConnection();
			//create a statement
			PreparedStatement stmt = 
 con.prepareStatement("insert into emp1(empName,empPwd,empEmail,empPhno)"
					+ " values(?,?,?,?)");
			stmt.setString(1, e.getEmpName());
			stmt.setString(2, e.getEmpPwd());
			stmt.setString(3, e.getEmpEmail());
			stmt.setString(4, e.getEmpPhno());
			
			 i = stmt.executeUpdate();
	
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return i;
	}
	
	
	public static boolean validate(Employee e) throws SQLException
	{
		Connection con = EmployeeDao.getConnection();
		PreparedStatement stmt =
 con.prepareStatement("select * from emp1 where empName=? and empPwd=?");
		stmt.setString(1, e.getEmpName());
		stmt.setString(2, e.getEmpPwd());
		
		ResultSet rs = stmt.executeQuery();
		boolean s = rs.next();
		//boolean s = stmt.execute();
		
		return s;
		
	}
}
