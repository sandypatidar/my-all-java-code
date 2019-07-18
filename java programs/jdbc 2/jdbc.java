import java.sql.*;
public class jdbc {
	public static void main(String[] args) throws Exception {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/mydb";
		String user = "root";
		String pass = "root";
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url , user, pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from sandy");
		while (rs.next()){
			System.out.println(rs.getInt(0)+" "+rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
		}
	}
}