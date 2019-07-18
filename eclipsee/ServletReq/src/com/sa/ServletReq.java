package com.sa;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class ServletReq extends HttpServlet {
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		String n=req.getParameter("userName");
		String p=req.getParameter("userPass");
		
		if(p.equals("sandeep")){
			RequestDispatcher rd = req.getRequestDispatcher("Servlet22");
			rd.forward(req, res);
		}
		else {
			out.print("\n user name or password wrong");
			RequestDispatcher rd = req.getRequestDispatcher("/index.html");
			rd.include(req, res);
		}
		
		
	}

}
