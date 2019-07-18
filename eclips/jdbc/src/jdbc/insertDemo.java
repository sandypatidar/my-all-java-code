package jdbc;
import java.sql.*;
import java.util.*;
public class insertDemo {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("please inter the is number");
		int id = sc.nextInt();
		System.out.println("please enter the name");
		String name = sc.nextLine();
		System.out.println("please enter the  adress");
		String address = sc.nextLine();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jitu", "root", "root");
		PreparedStatement st = con.prepareStatement("insert into hello values (?,?,?)");
		st.setInt(1, id);
		st.setString(2, name);
		st.setString(3, address);
		int x = st.executeUpdate();
		System.out.println(x+"rows affected");
		st.close();
		con.close();
		sc.close();		
	}

}
