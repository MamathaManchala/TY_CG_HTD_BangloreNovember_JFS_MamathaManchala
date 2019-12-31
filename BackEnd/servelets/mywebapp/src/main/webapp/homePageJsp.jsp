<%@page import="com.capgemini.mywebapp.bean.EmployeeInfoBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page session="false"%>

<%
	HttpSession session = request.getSession(false);
	EmployeeInfoBean employeeInfoBean = (EmployeeInfoBean) session.getAttribute("employeeInfoBean");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h3 style="color: navy;">
		Welcome
		<%=employeeInfoBean.getName()%></h3>
		
	<a href="./addEmp">Add Employee</a>
	<br>
	<a href="./updateEmp">Update Employee</a>
	<br>
	<a href="./deleteEmp">Delete Employee</a>
	<br>
	<a href="./searchEmp">Search Employee</a>
	<br>
	<a href="./seeAllEmployee">Search ALl Employee</a>
	<br>

	<br>
	<a href="./logout2">Logout</a>


</body>
</html>