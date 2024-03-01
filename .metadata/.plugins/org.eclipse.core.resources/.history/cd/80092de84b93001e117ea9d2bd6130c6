package session_11;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo1 {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver Fond");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","");
		System.out.println("Connection Established");
		
		CallableStatement stmt = con.prepareCall("{call new_procedure(?,?,?)}");
		
		stmt.setInt(1, 333);
		stmt.setString(2, "Omkar");
		stmt.setFloat(3, 56254.78f);
		
		stmt.execute();
		
		System.out.println("Success");
		
		con.close();
		
	}

}
