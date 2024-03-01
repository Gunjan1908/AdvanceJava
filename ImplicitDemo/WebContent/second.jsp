<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	int n1 = Integer.parseInt(request.getParameter("txtNum1"));
    int n2 = Integer.parseInt(request.getParameter("txtNum2"));
    int c = n1/n2;
    out.write("Division = "+c);  
%>
</body>
</html>