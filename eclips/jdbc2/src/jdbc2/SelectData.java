package jdbc2;
import java.sql.*;
import host.*;
public class SelectData implements Urls {
	public static void main(String[] args) throws Exception{
		Class.forName(dname);
		String query = "select * from sandeep";
		Connection con = DriverManager.getConnection(url, user, password);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		String data = "";
		while(rs.next()) {
			data = rs.getInt(1) + " : "+rs.getString(2) +" : "+ rs.getString(3);
			System.out.println(data);
		}
		st.close();
		con.close();
	}
}
