package com.sandy;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sandy.Dao.SandyDao;
import com.sandy.patidar.patidar;
public class sandyp extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			int id = Integer.parseInt(request.getParameter("id"));
			SandyDao sdao = new SandyDao();
			patidar p1 = sdao.getpatidar(id);
			request.setAttribute("name", p1);
			RequestDispatcher rd = request.getRequestDispatcher("ShowSandy.jsp");
			rd.forward(request, response);
			
	}
}
