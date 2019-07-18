import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class JdbcInsert implements User {
	public static void main(String[] args) throws Exception {
		Class.forName(Driver);
		String query = "insert into sandy value(102,'punit','pathak')";
		Connection con = DriverManager.getConnection(url,user,pass);
		Statement st = con.createStatement();
		int n = st.executeUpdate(query);
		System.out.println(n+" rows affected");
		st.close();
		con.close();
	}
}
