package jdbc;
import java.sql.*;
public class DeleteDemo {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jitu", "root", "root");
		Statement st = con.createStatement();
		int x = st.executeUpdate("drop table hello");
		System.out.println(x+" row effected");
	}
}
