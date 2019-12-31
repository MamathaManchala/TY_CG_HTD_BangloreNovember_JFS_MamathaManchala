package com.capgemini.mywebapp.servelets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capgemini.mywebapp.bean.EmployeeInfoBean;
import com.capgemini.mywebapp.services.EmployeeService;
import com.capgemini.mywebapp.services.EmployeeServiceImpl;

@WebServlet("/searchEmployee")
public class SearchEmpServlet extends HttpServlet {

	private EmployeeService employeeService = new EmployeeServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		//Get the Form data7
		
		String empIdVal = req.getParameter("empId");
		
		int empId = Integer.parseInt(empIdVal);
				
		EmployeeInfoBean employeeInfoBean = employeeService.searchEmployee(empId);
	
	resp.setContentType("text/html");
	PrintWriter out = resp.getWriter();
	out.print("<html");
	out.print("<body>");
	
	if(employeeInfoBean !=null) {
		
		
		out.println("<h3>Employee Id "+ " Found-</h3>");
		out.println("Name ="+ employeeInfoBean.getName());
		out.println("<br>Age = "+employeeInfoBean.getAge());
		out.println("<br>Salary= "+ employeeInfoBean.getSalary());
		out.println("<br>Designation "+ employeeInfoBean.getDesignation());
	}else {
		
		out.println("<h3 style='colour: red'>Employee ID "+ empId + "Not Found!</h3>");
		
	}
	out.println("</body>");
	out.println("</html>");
	
	
	}
}
