import java.sql.*;
public class JdbcDemo implements User {
	public static void main(String[] args) throws Exception {
		Class.forName(Driver);
		String query = "create table sand(Id int, Name varchar(30), Uname varchar(30), primary key(Id))";
		Connection con = DriverManager.getConnection(url,user,pass);
		Statement st = con.createStatement();
		int n = st.executeUpdate(query);
		System.out.println("table is created");
		st.close();
		con.close();
	}
}
