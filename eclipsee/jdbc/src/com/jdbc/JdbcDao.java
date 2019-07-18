package com.jdbc;
import java.sql.*;
public class JdbcDao {

	public static void main(String[] args) {
		StudentDao dao = new StudentDao();
		Student s1 = dao.getStudent(101);
		System.out.println(s1);
	}
}
class StudentDao {
	public Student getStudent(int C_id) {
		try {
			Student s = new Student();
			s.C_id = C_id;
			String query = "select fname from customer where C_id="+C_id;
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			rs.next();
			String name = rs.getString(1);
			s.fname = name;
			return s;
		} catch (Exception e) {
			
		}
		return null;
   }
}
class Student {
	int C_id;
	String fname;
}