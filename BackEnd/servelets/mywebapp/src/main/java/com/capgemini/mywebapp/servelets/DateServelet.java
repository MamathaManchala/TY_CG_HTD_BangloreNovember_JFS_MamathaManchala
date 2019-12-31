package com.capgemini.mywebapp.servelets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DateServelet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// Current System & date
		Date date = new Date();
		
		//Get the context param
		
		//ServletContext context = getServletContext();
		ServletContext context = req.getServletContext();
		String contextParamVal=context.getInitParameter("myContextParam");
		
		//Get Config Param
		
		ServletConfig config = getServletConfig();
		String configParamVal=config.getInitParameter("myConfigParam");
		
		
	resp.setContentType("text/html");
	resp.setHeader("refresh", "1");
	
	PrintWriter out = resp.getWriter();
	out.print("<html>");
	
	//displayinf context Param & config Param value
	
	out.print("<h2>Current system Date & Time - <br> " + date + "</h2>");
	out.println("<br><br>Context Param Value = "+ contextParamVal);
	out.println("<br><br>Config Param Value = "+ configParamVal);
	out.print("</html>");
	
	
	
	
	
	
	
	}//End of doGet

}// End of class
