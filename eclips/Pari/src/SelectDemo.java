import java.sql.*;
public class SelectDemo implements host {

	public static void main(String[] args) throws Exception{
		String query = "select * from demo";
		Class.forName(Dname);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement st = con.createStatement();
		ResultSet rs= st.executeQuery(query);
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" | "+rs.getString(2)+" | "+rs.getString(3));
		}
	}

}
