package com.sandy;
import java.io.*;
import java.util.Enumeration;

import javax.servlet.*;
import javax.servlet.http.*;

public class ServletContextDemo extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		ServletContext context = getServletContext();
		Enumeration<String> n = context.getAttributeNames();
		String str = "";
		while (n.hasMoreElements()) {
			str =  n.nextElement();
			out.print("<br> "+context.getInitParameter(str));			
		}
	}

}
