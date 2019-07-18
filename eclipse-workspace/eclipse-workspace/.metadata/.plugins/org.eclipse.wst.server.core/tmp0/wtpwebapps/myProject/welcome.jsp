<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>hello i am welcom</h3>
	<%
		int n = (Integer)request.getAttribute("x");
	     JdbcDao j = new JdbcDao();
	
	%>
</body>
</html>