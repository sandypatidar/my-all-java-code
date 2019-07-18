package jdbc2;
import java.sql.*;
import host.*;
public class DeleteData implements Urls {
	public static void main(String[] args) throws Exception {
		Class.forName(dname);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement st = con.createStatement();
		st.executeUpdate("drop database jitu");
		System.out.println("query done");
		st.close();
		con.close();
	}

}
