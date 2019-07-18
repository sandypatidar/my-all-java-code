import java.sql.*;
public class InsertData implements host {
	public static void main(String[] args) throws Exception {
		String query = "insert into demo values(?,?,?)";
		int d_id = 7;
		String name = "guru";
		String add = "dhulasr";
		Class.forName(Dname);
		Connection con = DriverManager.getConnection(url, user, password);
		PreparedStatement st = con.prepareStatement(query);
		st.setInt(1, d_id);
		st.setString(2, name);
		st.setString(3, add);
		int x = st.executeUpdate();
		System.out.println(x+" rows affected");
	}
}
