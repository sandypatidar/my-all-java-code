<%@page import="java.sql.*" %>
<% Class.forName("com.mysql.cj.jdbc.Driver"); %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>index2</title>
</head>
<body>
	<h3>data base connecting</h3>
	<%!
		public class Actor {
		String url = "jdbc:mysql://localhost:3306/mydb";
		String root = "root";
		String pass="sandy";
		Connection con = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		
		public Actor (){
			try{
			con = DriverManager.getConnection(url,root,pass);
			st = con.prepareStatement("select * from sandy where id = ?");
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
	
		public ResultSet getActors(int id){
			try{
				st.setInt(1, id);
				rs = st.executeQuery();
			}
			catch(Exception e){
				
			}
			return rs;
		}
	}
	%>
	<%
		int ids = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		
		Actor actor = new Actor();
		ResultSet actors = actor.getActors(ids);
	%>
	<table border="1" >
		<tbody>
			<tr>
				<td>Id</td>
				<td>name</td>
				<td>Sname</td>
			</tr>
			<% while(actors.next()) { %>
			<tr>
				<td><%= actors.getInt("Id") %></td>
				<td><%= actors.getString("Name") %></td>
				<td><%= actors.getString("Uname") %></td>
			</tr>
			<% } %>
		</tbody>
		</table>
	
	
	
	
	
	
	
	
	
	
	
	

</body>
</html>