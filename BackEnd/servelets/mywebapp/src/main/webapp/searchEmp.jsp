<%@page import="com.capgemini.mywebapp.bean.EmployeeInfoBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page session="false"%>
<% EmployeeInfoBean employeeInfoBean=(EmployeeInfoBean) request.getAttribute("employeeInfoBean"); %>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<fieldset>
		<legend>search Employee</legend>
		<form action="./searchEmployee3">
			Employee ID : <input type="number" name="empId" required><br>
			<input type="submit" value="search">
		</form>
	</fieldset>
	<br>
	<br>
	<%if(employeeInfoBean == null) { %>
	<h3 style="color: red;">Employee Id Not Found</h3>
	<% } else { %>
	<h3 style="color: green">
		Employee Id
		<%=employeeInfoBean.getEmpId() %></h3>
	<br> Employee Name =<%=employeeInfoBean.getName() %>
	<br> Age =<%=employeeInfoBean.getAge() %>
	<br> Salary =<%=employeeInfoBean.getSalary() %>
	<br> Designation =<%=employeeInfoBean.getDesignation() %>
	<br>

	<% } %>
</body>
</html>