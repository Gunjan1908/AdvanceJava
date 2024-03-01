<%@page import="java.util.*,com.app.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%
	List<Student> data = new ArrayList<Student>();
	data.add(new Student("Rahul","Pawar",false));
	data.add(new Student("Sayalee","Patil",false));
	data.add(new Student("Pratik","Patel",true));
	pageContext.setAttribute("myStudents", data);	/* refers page env. */
%>
<body>
<table border="1">
<tr>
<th>FirstName</th>
<th>LastName</th>
<th>GoldStudent</th>
</tr>
<c:forEach var="temp" items="${myStudents}"> 
<tr>
<td>${temp.firstName}</td>
<td>${temp.lastName}</td>
<td>
<c:if test="${temp.goldStudent}">
Gold Student
</c:if>
<c:if test="${not temp.goldStudent}">
-
</c:if>
</td>
</tr>
</c:forEach>
</table>
</body>
</html>




