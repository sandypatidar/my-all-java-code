package com.ser;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.ser.sql.Sql;
public class Servletss extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException , ServletException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		String name = req.getParameter("uname");
		String surname = req.getParameter("sname");
		long phone = Long.parseLong(req.getParameter("phone"));
		String email = req.getParameter("email");
		
		Sql s = new Sql();
		try {
			s.conn();
		} catch (Exception e) {
			System.out.println(e);
		}
		
		out.print("Your name is "+name+" "+surname+"<br>");
		out.print("your email id is "+email+"<br>");
		out.print("your phone number is +91"+phone+"<br>");
	}
}
