package in.login;
import java.io.IOException;
import javax.jws.WebService;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;  
@WebServlet("/Login")
public class Login extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		String uname = req.getParameter("uname");
		String pass = req.getParameter("password");
		if(uname.equals("sandeep") && pass.equals("patidar")) {
			HttpSession session = req.getSession();
			session.setAttribute("uname", uname);
			
			res.sendRedirect("welcome.jsp");
		} else {
			res.sendRedirect("login.jsp");
		}
	}
}
