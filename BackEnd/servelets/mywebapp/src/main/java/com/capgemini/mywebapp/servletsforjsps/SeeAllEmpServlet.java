package com.capgemini.mywebapp.servletsforjsps;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.capgemini.mywebapp.bean.EmployeeInfoBean;
import com.capgemini.mywebapp.services.EmployeeService;
import com.capgemini.mywebapp.services.EmployeeServiceImpl;

@WebServlet("/seeAllEmployee")
public class SeeAllEmpServlet  extends HttpServlet{
	
	private EmployeeService service= new EmployeeServiceImpl();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	HttpSession session=req.getSession(false);
	
	if(session != null) {
		
		List<EmployeeInfoBean> employeeList = service.getAllEmployees();
		if(employeeList != null && !employeeList.isEmpty()) {
			req.setAttribute("employeeList", employeeList);
			
			
		
			
		}else {
			req.setAttribute("msg", "There is No Data to Display...");
			req.getRequestDispatcher("./searchAllEmp.jsp").forward(req, resp);
		}
		
	}
	else {
		req.setAttribute("msg", "Please Login First");
		req.getRequestDispatcher("./loginForm").forward(req, resp);
	}
		
		
	}
	
	
}
