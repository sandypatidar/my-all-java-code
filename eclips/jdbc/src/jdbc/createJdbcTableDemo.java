package jdbc;
import java.sql.*;
public class createJdbcTableDemo {

	public static void main(String[] args) throws Exception {
	
		String url ="jdbc:mysql://localhost:3306/jitu";
		String uname ="root";
		String pass = "root";		
// 		String query = "insert into Demo values(?,?,?)";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname,pass);
		Statement st = con.createStatement();
		
		st.executeUpdate("create table hello(Sid int , Sname varchar(20) ,Saddress varchar(20))");
		
		System.out.println("table created successfully");
			
		st.close();
		con.close();
	}
}
 