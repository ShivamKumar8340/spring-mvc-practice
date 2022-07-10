<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String name =(String)request.getAttribute("name");
	 	Integer id =(Integer)request.getAttribute("age");
	%>
	<h1>data is sending by Model</h1>
	<h1>My name is <%=name%></h1>
	<h2>My age is <%=id%></h2>
</body>
</html>