package jdbc;
import java.sql.*;
public class InsertDemo4 {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/jitu";
		String user = "root";
		String password = "root";
		Connection con = DriverManager.getConnection(url, user, password);
		Statement st = con.createStatement();
		int x = st.executeUpdate("insert into sandeep values (2,'sandeep','hanumantiya')");
		System.out.println(x+" rows effected");

	}

}
