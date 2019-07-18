package jdbc2;
import java.sql.*;
import host.*;
public class InsertData implements Urls {
	public static void main(String[] args) throws Exception {
		Class.forName(dname);
		String query = "insert into clg values(1, 'aaksh' , 'belgav')";
		Connection con = DriverManager.getConnection(url, user, password);
		Statement st = con.createStatement();
		int count = st.executeUpdate(query); 
		System.out.println(count +" rows effected");
	}

}
