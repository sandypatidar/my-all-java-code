import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class JdbcSelect implements User {
	public static void main(String[] args) throws Exception {
		Class.forName(Driver);
		String query = "select * from sandy";
		Connection con = DriverManager.getConnection(url,user,pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		while(rs.next()) {
			System.out.println(rs.getInt(0)+" | "+rs.getString(1)+" | "+rs.getString(2));	
		}
		st.close();
		con.close();
	}
}
