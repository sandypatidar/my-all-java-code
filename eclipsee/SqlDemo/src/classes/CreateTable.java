package classes;
import java.sql.Connection;
import java.util.Scanner;
import java.sql.*;
public class CreateTable implements Users{
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the query");
		String query = sc.nextLine();
		Class.forName(Driver);
		Connection con = DriverManager.getConnection(url, user, pass);
		Statement st = con.createStatement();
		st.executeUpdate(query);
		System.out.println(" table is create ");
		sc.close();
		st.close();
		con.close();
	}

}
