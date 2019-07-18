package com.ser.sql;
import java.sql.*;
public class Sql {
	public static void conn() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");
		Statement st = con.createStatement();
		st.executeUpdate("create table sand(id int ,name varchar(220), uname varchar(20)");
		System.out.println("table created successfully");
	}
}
