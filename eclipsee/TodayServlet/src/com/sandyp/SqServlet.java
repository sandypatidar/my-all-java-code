package com.sandyp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;

public class SqServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int k = Integer.parseInt(req.getParameter("k"));
		k = k*k;
		
		PrintWriter out = res.getWriter();
		out.println("Result is "+k);
		
		System.out.println("sq called");
	}
}
