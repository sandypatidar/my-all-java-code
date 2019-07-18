package jdbc;
import java.sql.*;
public class CreateTable {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jitu", "root", "root");
		Statement st = con.createStatement();
		st.executeUpdate("create table CUSTOMERS(id int , Name varchar(20) , Age int , Address varchar(20), Salary varchar(20))");
		System.out.println("table created successfully");
		
		st.close();
		con.close();
	}

}
