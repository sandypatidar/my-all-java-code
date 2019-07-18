package jdbc2;
import java.sql.*;
import host.*;
public class InserData2 implements  Urls {
	public static void main(String[] args)throws Exception {
		Class.forName(dname);
		int id = 102;
		String name = "sandeep";
		String add = "indore";
		String query = "insert into clg values (?,?,?)";
		Connection con = DriverManager.getConnection(url, user, password);
		PreparedStatement st = con.prepareStatement(query);
		st.setInt(1, id);
		st.setString(2, name);
		st.setString(3, add);
		int x = st.executeUpdate();
		System.out.println(x+" rows affeted");
		st.close();
		con.close();

	}

}
