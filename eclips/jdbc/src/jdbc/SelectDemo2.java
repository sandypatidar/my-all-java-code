package jdbc;
import java.sql.*;
public class SelectDemo2 {
	
		public static void main(String[] args) throws Exception {
		
			String url ="jdbc:mysql://localhost:3306/jitu";
			String uname ="root";
			String pass = "root";
			String query = "select * from hello";
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, uname,pass);
			Statement st = con.createStatement();
			ResultSet rs =  st.executeQuery(query);
			String userData ="";
			
			while(rs.next()) {
			userData = rs.getInt(1) + " : "+rs.getString(2)+ " : "+rs.getString(3);
			System.out.println(userData);
			}		
			st.close();
			con.close();
		}

}
