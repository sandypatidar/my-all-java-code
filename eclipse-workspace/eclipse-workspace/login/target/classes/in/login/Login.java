package in.login;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;


public class Login extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException ,ClassNotFoundException{
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");
		if(uname.equals("sandeep") && pass.equals("patidar")) {
			response.sendRedirect("welcome.jsp");
		} else {
			response.sendRedirect("index.jsp");
		}
	}

}
