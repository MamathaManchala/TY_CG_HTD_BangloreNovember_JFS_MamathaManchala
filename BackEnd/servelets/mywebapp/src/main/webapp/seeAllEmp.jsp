<%@page import="com.capgemini.mywebapp.bean.EmployeeInfoBean"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>



<%@ page session="false"%>


<%
	List<EmployeeInfoBean> employeeList = (List<EmployeeInfoBean>) request.getAttribute("employeeList");
	String msg = (String) request.getAttribute("msg");
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h4>
		<a href="./home">Home</a>
	</h4>
	<%
		if (employeeList != null && !employeeList.isEmpty()) {
	%>

	<table>
		<tr>
			<th>EmpId</th>
			<th>Name</th>
			<th>Age</th>
			<th>salary</th>
			<th>Designation</th>

		</tr>

		<%
			for (EmployeeInfoBean employeeInfoBean : employeeList) {
		%>
		<tr>

			<td><%=employeeInfoBean.getEmpId()%></td>
			<td><%=employeeInfoBean.getName()%></td>
			<td><%=employeeInfoBean.getAge()%></td>
			<td><%=employeeInfoBean.getSalary()%></td>
			<td><%=employeeInfoBean.getDesignation()%></td>

		</tr>

		<%
			}
		%>
	</table>


	<%
		}
	%>
	
	<%
		if (msg != null && !msg.isEmpty()) {
	%>

	<h3 style="color: red;"><%=msg%></h3>

	<%
		}
	%>


</body>
</html>