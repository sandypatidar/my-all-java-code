package com.sarv;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Config extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException , ServletException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		ServletConfig config = getServletConfig();
		Enumeration<String> e = config.getInitParameterNames();
		
		String str="";
		while (e.hasMoreElements()) {
			str  = (String) e.nextElement();
			out.print("<br>name: "+str);
			out.println("<br>value: "+config.getInitParameter(str));			
		}
		out.close();
	}

}
