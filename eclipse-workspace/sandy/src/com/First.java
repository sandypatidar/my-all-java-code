package com;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
public class First extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String name = req.getParameter("name");
		PrintWriter out = res.getWriter();
		out.println("welcom "+name);
	}
}
