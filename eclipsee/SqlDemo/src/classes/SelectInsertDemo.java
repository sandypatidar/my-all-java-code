package classes;
import java.sql.*;
import java.util.*;
public class SelectInsertDemo implements Users {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter query");
		String query = sc.nextLine();
		Class.forName(Driver);
		Connection con = DriverManager.getConnection(url, user, pass);
		Statement st = con.createStatement();
		boolean b = st.execute(query);
		if(b) {
			ResultSet rs = st.getResultSet();
			while (rs.next()) {
				System.out.println("> "+rs.getInt(1)+" | "+rs.getString(2)+" | "+rs.getString(3)+" | "+rs.getString(4)+" | "+rs.getString(5));
			}
		}
		else {
			int bs = st.getUpdateCount();
			System.out.println("> "+bs+" the row affected ");
		}
		sc.close();
		st.close();
		con.close();
		
	}

}
