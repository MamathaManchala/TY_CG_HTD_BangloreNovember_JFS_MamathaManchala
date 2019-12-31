package com.capgemini.mywebapp.servelets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetEmployeeServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		//Get the Query String
		String idVal = req.getParameter("id");
		
	//Get the context param
		
		//ServletContext context = getServletContext();
		ServletContext context = req.getServletContext();
		String contextParamVal=context.getInitParameter("myContextParam");
		
		
		//Get Config Param
		
				ServletConfig config = getServletConfig();
				String configParamVal=config.getInitParameter("myConfigParam");
				
				
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.print("<html>");
		out.print("<body>");
		out.print("Employee Id = " + idVal);
		out.print("Name = Nani");
		out.print("Salary = 100000");
		out.println("<br><br>Context Param Value = "+ contextParamVal);
		out.println("<br><br>Config Param Value = "+ configParamVal);
		out.print("</body>");
		out.print("</html>");
		
	}//End of doGet
}//ENd Off Class
