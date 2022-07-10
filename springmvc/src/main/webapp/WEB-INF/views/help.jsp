<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



	<%-- <!--  <%  %> this is a old way to get and print data -->
	<% 
	String add =(String) request.getAttribute("address");
	%>
	
	<h1>
	address is
	 <%=add%>
	</h1> --%>
	
	
	<!-- using jspEl language easy way -->
	<h1> My Address id ${address } </h1>
	
	<h2>Time is 
		${nowTime }
	
	</h2>
	
	
	
	
</body>
</html>