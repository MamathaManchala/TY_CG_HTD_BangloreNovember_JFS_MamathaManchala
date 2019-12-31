package com.capgemini.mywebapp.servelets;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/include")
public class IncludeServlet extends HttpServlet {

	
	

		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			String url = "./currentDate";


			resp.setContentType("text/html");
			PrintWriter out = resp.getWriter();
			out.println("<html>");
			out.println("<body>");
			out.println("<h2>Hello user</h2>");
			RequestDispatcher dispatcher = req.getRequestDispatcher(url);
			dispatcher.include(req, resp);
			out.println("<br><h2>Thank you</h2>");
			out.println("</body>");
			out.println("</html>");

}
}
