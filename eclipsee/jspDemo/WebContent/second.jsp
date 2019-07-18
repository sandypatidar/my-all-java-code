<html>
<body>
<%
	String s = (String)session.getAttribute("user");
	out.print("hello "+s);
%>
</body>
</html>