<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="u" class="com.app.User"/>
<!-- User u = new User(); -->
<jsp:setProperty property="*" name="u"/>

User Details are as follows:
FirstName: <jsp:getProperty property="firstName" name="u"/>
<br>
LastName: <jsp:getProperty property="lastName" name="u"/>
<br>
Age: <jsp:getProperty property="age" name="u"/>
</body>
</html>