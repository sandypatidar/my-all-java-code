package jdbcConnectivity;
import java.sql.*;
public class JdbcCon {

	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/jitu";
		String user = "root";
		String password = "root";
		String dname = "com.mysql.cj.jdbc.Driver";

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");
		Statement st = con.createStatement();
		st.executeUpdate("create table CUSTOMERS(id int , Name varchar(20) , Age int , Address varchar(20), Salary varchar(20))");
		System.out.println("table created successfully");
		st.close();
		con.close();

	}

}
