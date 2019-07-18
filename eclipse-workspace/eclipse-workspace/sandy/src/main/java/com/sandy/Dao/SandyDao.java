package com.sandy.Dao;
import java.sql.*;
import com.sandy.patidar.patidar;

public class SandyDao {
	public patidar getpatidar(int id) {
		patidar p = new patidar();
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","sandy");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from sandy where id ="+id);
			if(rs.next()) {
				p.setId(rs.getInt("id"));
				p.setName(rs.getString("name"));
				p.setSname(rs.getString("uname"));
			}
		} catch (Exception e) {
		}
		return p;
	}
	
}
