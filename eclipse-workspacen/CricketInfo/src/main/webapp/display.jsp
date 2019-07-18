<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page errorPage="error.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	int x = Integer.parseInt(request.getParameter("a1"));
	int y = Integer.parseInt(request.getParameter("a2"));
	int z = x/y;
	out.print(x);
%>

</body>
</html>