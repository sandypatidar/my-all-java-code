package in;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.*;
import javax.servlet.http.*;

public class Servlets extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String name = req.getParameter("name");
		String sname = req.getParameter("Sname");
		int id = Integer.parseInt(req.getParameter("id"));
		PrintWriter pw = res.getWriter();
		
		try {
			sqlPro(id,name,sname);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void sqlPro(int id, String name, String sname) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String query = "insert into sandy value("+id+","+name+","+sname+")";
		try {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sandy","root","sandy");
		Statement st = con.createStatement();
		int n = st.executeUpdate(query);
		System.out.println(n+" rows affected");
		st.close();
		con.close();
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
