<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		int ids = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String uname = request.getParameter("uname");
		Connection con=null;
		Statement st = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","sandy");
			st = con.createStatement();
			/* st.setInt(1, ids);
			st.setString(2, name);
			st.setString(3,uname); */
			int n = st.executeUpdate("insert into sandy value(105, 'sandeep','lalita')");
			out.print(n+" rows affected");
		} catch(Exception e){
			out.print(e.getStackTrace());
		}
		
		
	%>

</body>
</html>