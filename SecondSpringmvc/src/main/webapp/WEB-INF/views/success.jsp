<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>


<!-- this page only for show data in browser  -->
</head>
<body>
		<h1 class="text-center">${Header }</h1>
		<p class="text-center">${Description }</p>
		
	<h3>${student.email }</h3>
	<h3>${student.name }</h3>
	<h3>${student.password }</h3>
	
</body>
</html>