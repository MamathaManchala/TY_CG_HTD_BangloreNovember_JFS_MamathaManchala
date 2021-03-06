package com.capgemini.mywebapp.servelets;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/readCookie")
public class ReadCookie extends HttpServlet {
	
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// Get the Cookies
			Cookie[] cookies = req.getCookies();

			resp.setContentType("text/html");
			PrintWriter out = resp.getWriter();

			req.getRequestDispatcher("./cookiePage.html").include(req, resp);
			out.println("<html>");
			out.println("<body>");
			if(cookies!=null) {
				for(Cookie cookie : cookies) {
					out.println("Cookie Name :"+cookie.getName());
					out.println("<br>Cookie Value: "+cookie.getValue());
				}
			}
			else {
				System.out.println("Cookies not found");
			}
			out.println("</body>");
			out.println("</html>");
		}//End of doGet()
	}//End of the class

