package com.capgemini.mywebapp.servletsforjsps;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.capgemini.mywebapp.bean.EmployeeInfoBean;
import com.capgemini.mywebapp.services.EmployeeService;
import com.capgemini.mywebapp.services.EmployeeServiceImpl;

@WebServlet("/addEmployee2")

public class AddEmpServlet extends HttpServlet{


	private EmployeeService service= new EmployeeServiceImpl();


	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession(false);
		if(session != null) {
			//valid session
			//Get the Form data

			int empId = Integer.parseInt(req.getParameter("empId"));
			String name= req.getParameter("name");
			int age=Integer.parseInt(req.getParameter("age"));
			double salary=Double.parseDouble(req.getParameter("salary"));
			String designation =req.getParameter("designation");
			String password =req.getParameter("password");

			EmployeeInfoBean employeeInfoBean=new EmployeeInfoBean();
			employeeInfoBean.setEmpId(empId);
			employeeInfoBean.setName(name);
			employeeInfoBean.setAge(age);
			employeeInfoBean.setSalary(salary);
			employeeInfoBean.setDesignation(designation);
			employeeInfoBean.setPassword(password);


			boolean isAdded=  service.addEmployee(employeeInfoBean);
			if(isAdded) {
				
				req.setAttribute("msg", "Employee Details Inserted Successfully");
			}
			else {
				
				req.setAttribute("msg", "Employee Details Not Inserted Successfully");
			}

		}else {
			req.setAttribute("msg", "Please Login First!!!");
			req.getRequestDispatcher("./loginForm").forward(req, resp); 


			}

	}
}

