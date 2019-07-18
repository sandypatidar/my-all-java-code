package com.sa;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class Servler2 extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		String n = req.getParameter("userName");
		out.println("welcome "+n);
	}
}
