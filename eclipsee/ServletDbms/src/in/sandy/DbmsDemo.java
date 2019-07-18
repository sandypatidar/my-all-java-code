package in.sandy;
import java.sql.*;
import in.Users;
public class DbmsDemo implements Users {
	public static void main(String[] args) throws Exception {
		String query = "select * from customers";
		Class.forName(Driver);
		Connection con = DriverManager.getConnection(url, user, pass);
		Statement st = con.createStatement();
		boolean b = st.execute(query);
		if(b) {
			ResultSet rs= st.getResultSet();
			while(rs.next()) {
				System.out.println("> "+rs.getInt(0)+" "+rs.getString(1)+" "+rs.getInt(2)+" "+rs.getString(3)+" "+rs.getInt(4));
			}
		}
		else {
			int n = st.getUpdateCount();
			System.out.println(n+" rows effected");
		}
		
	}
}
