
<!DOCTYPE html>
<html>
<body>
	<%
	String name = request.getParameter("uname");
	out.print("Today is: "+java.util.Calendar.getInstance().getTime()+"<br>");
	out.print("<br><br> welcome "+name);
	%>
</body>
</html>