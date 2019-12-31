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

@WebServlet("/deleteEmployee2")
public class DeleteEmpServlet extends HttpServlet {

private EmployeeService service= new EmployeeServiceImpl();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	HttpSession session  = req.getSession(false);
	
	
	if(session != null) {
		//valid session
		int empId = Integer.parseInt(req.getParameter("empId"));
		
		boolean isDeleted = service.deleteEmployee(empId);
		
		if(isDeleted) {
		req.setAttribute("msg", "Record for Employee Id" + empId + "Deleted");
	
		}else {
			req.setAttribute("msg", " Employee Id" + empId + "Not Fount!");
		}
		
		req.getRequestDispatcher("./deleteEmp.jsp").forward(req, resp);
	}else {
		//Invalid session
		
		req.setAttribute("msg", "Please Login First");
		req.getRequestDispatcher("./loginForm").forward(req, resp);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}//End of do get
}// End of Class
