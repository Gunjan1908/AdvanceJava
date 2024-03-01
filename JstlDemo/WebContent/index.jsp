<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL</title>
</head>
<body>
<c:out value="${'Welcome to Infoway'}"></c:out>
<br><br>
<c:set var="date" value="<%= new Date() %>"></c:set>
Time on the Server: ${date}
</body>
</html>