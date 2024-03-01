<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Table</title>
</head>
<body>
<%
int num = Integer.parseInt(request.getParameter("txtNum"));
%>
<table border="1">
	<%
	for(int i=1;i<=10;i++)
	{
	%>
	<tr>
	<td><%= (num*i) %></td>
	</tr>
	<%
	}
	%>	
</table>
</body>
</html>



