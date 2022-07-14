<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
   
    
    <form action="processform" method="post">
    
     <div class="form-group">
    <label for="exampleInputId">Id</label>
    <input type="text" 
    class="form-control"
     id="exampleInputId"
      aria-describedby="idHelp"
      placeholder="Enter id"
      name="id">
    </div>
    
    
    <div class="form-group">
    <label for="exampleInputFirstName">FirstName</label>
    <input type="text" 
    class="form-control" 
    id="exampleInputFirstName" 
    aria-describedby="firstNameHelp" 
    placeholder="Enter FirstName"
    name="FirstName">
    </div>
    
    <div class="form-group">
    <label for="exampleInputLastName">LastName</label>
    <input type="text" 
    class="form-control" 
    id="exampleInputLastName" 
    aria-describedby="lastNameHelp" 
    placeholder="Enter lastName"
    name="lastName">
    </div>
    
    
    <div class="form-group">
    <label for="exampleInputGender">Gender</label>
    <input type="text" 
    class="form-control" 
    id="exampleInputGender" 
    aria-describedby="genderHelp" 
    placeholder="Enter gender"
    name="gender">
    </div>
    
    <div class="container text-center">
    <button type="submit" class="btn btn-success" >Sign up</button>
    </div>
    
    </form>
    
    
    
    
     </div>
     
</body>
</html>