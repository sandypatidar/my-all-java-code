package classes;
import java.sql.*;
import java.util.*;
public class InsertDemo implements Users {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String query = sc.nextLine();
		Class.forName(Driver);
		Connection con = DriverManager.getConnection(url, user, pass);
		Statement st = con.createStatement();
		int n = st.executeUpdate(query);
		System.out.println(n+" line inserted");
		sc.close();
		st.close();
		con.close();
	}

}
