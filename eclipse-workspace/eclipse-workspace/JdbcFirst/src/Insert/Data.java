package Insert;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Data")
public class Data extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int ids = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String uname = request.getParameter("uname");
		PrintWriter out = response.getWriter();
		out.print(ids+" "+name+" "+uname);
//		Data d = new Data();
//		out.print(d.getSql()+" rows affected");
	}
	public ResultSet getSql() {
			int a =0;
			String str ="";
			String str2 ="";
		Connection con=null;
		Statement st = null;
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","sandy");
			st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from sandy");
			while(rs.next()) {
				 a =rs.getInt(0);
				 str = rs.getString(1);
				 str2 = rs.getString(2);
			}
		} catch(Exception e){
			//out.print(e.getStackTrace());
		}
		
		return 0;
	}

}
