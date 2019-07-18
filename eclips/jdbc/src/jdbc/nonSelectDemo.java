package jdbc;
import java.sql.*;
public class nonSelectDemo {

	public static void main(String[] args) throws Exception {
	
		String url ="jdbc:mysql://localhost:3306/mydb";
		String uname ="root";
		String pass = "root";
		int userId = 7;
		String userName = "jitendra";
		String userAdd = "reva";
 		String query = "insert into Demo values(?,?,?)";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname,pass);
		PreparedStatement st = con.prepareStatement(query);
		st.setInt(1, userId);
		st.setString(2, userName);
		st.setString(3, userAdd);
		int count =  st.executeUpdate();
		
		System.out.println(count + " row/s affected ");
			
		st.close();
		con.close();
	}
}
 