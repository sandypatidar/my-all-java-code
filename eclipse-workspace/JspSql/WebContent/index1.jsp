<!DOCTYPE html>
<%@page import="java.sql.*"%>
<% Class.forName("com.mysql.cj.jdbc.Driver"); %>
<html>
<head>
<title>Index1</title>
</head>
<body>
	<%
		int id = Integer.parseInt(request.getParameter("id"));		
		String name = request.getParameter("name");
		String uname =  request.getParameter("uname");
		String query = "insert into patidar value("+id+","+name+","+uname+")";
		
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
			Statement st = con.createStatement();
			int n = st.executeUpdate(query);
			out.print(n+" rows update");
		}
		catch(Exception e){
			e.getMessage();
		}
		
	%>
</body>
</html>