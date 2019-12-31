package com.capgemini.mywebapp.servelets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.capgemini.mywebapp.dao.EmployeeDaoImpl;
import com.capgemini.mywebapp.services.EmployeeService;
import com.capgemini.mywebapp.services.EmployeeServiceImpl;

@WebServlet("/deleteEmployee")
public class DeleteEmployeeServlet extends HttpServlet {

	private EmployeeService service=new EmployeeServiceImpl();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session=req.getSession(false);

		if(session != null) {
			//Valid session
			int empId= Integer.parseInt(req.getParameter("empId"));
			PrintWriter out=resp.getWriter();
			out.println("<html>");
			out.println("<body>");

			if(service.deleteEmployee(empId))		{


				out.println("<h3 style='color: red'>Employee Record for "+ empId + "Deleted!</h3>");

			}else {


				out.println("<h3 style='color: red'>Employee Id "+ empId + "Not Found!</h3>");
			}
			out.println("</body>");
			out.println("</html>");
			

			req.getRequestDispatcher("./deleteEmp.html").include(req, resp);

		}else {

			//Invalid session
			PrintWriter out = resp.getWriter();
			out.println("<html>");
			out.println("<body>");
			out.println("<h3 style='color: red'>Please Login FIrst!</h3>");
			out.println("</body>");
			out.println("</html>");
			
			
			req.getRequestDispatcher("./loginPage.html").include(req, resp);

		}

	}
}
