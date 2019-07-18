package jdbc2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import host.*;
public class CreateDemo implements Urls  {
	public static void main(String[] args) throws Exception {
		Class.forName(dname);
		String query = "create table clg(id int not null primary key, name varchar(20), address varchar(20) )";
		Connection con = DriverManager.getConnection(url, user, password);
		Statement st = con.createStatement();
		st.executeUpdate(query);
		System.out.println("table successfully create");
	}

}
