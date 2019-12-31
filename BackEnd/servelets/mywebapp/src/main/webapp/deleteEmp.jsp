<%@page import="com.capgemini.mywebapp.bean.EmployeeInfoBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
    <%@ page session="false"%>
    <%String msg =(String) request.getAttribute("msg"); %>
    



<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>




	<fieldset>
		<legend>delete Employee</legend>
		<form action="./deleteEmployee2" method="get">
			Employee ID : <input type="number" name="empId" required><br>
			<input type="submit" value="delete">


		</form>



	</fieldset>
	
	
	
	<%if(msg != null && !msg.isEmpty()) { %>
	<h3 style="color: red;">Employee Id is Deleted</h3>
	<% }  %>
	
		
		
		
		
		

</body>
</html>