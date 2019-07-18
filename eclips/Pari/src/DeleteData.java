import java.sql.*;
public class DeleteData implements host {

	public static void main(String[] args) throws Exception {
		Class.forName(Dname);
		String query = "delete from demo where d_id = 7";
		Connection con = DriverManager.getConnection(url, user, password);
		Statement st = con.createStatement();
		int x = st.executeUpdate(query);
		System.out.println(x+" rows affected");

	}

}
