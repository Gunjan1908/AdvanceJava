<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!
	int num = 100;
	public String toLower(String str)
	{
		return str.toLowerCase();
	}
%>
<%
	String name = request.getParameter("txtUsername");
	String pwd = request.getParameter("txtPassword");
	out.write("Name = "+name+" Password = "+pwd);
%>
<%-- <%= "Name = "+request.getParameter("txtUsername") %> --%>

<%-- <%= "ToLowerCase = "+toLower("HELLO") %> --%>


</body>
</html>