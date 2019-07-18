<html>
<body>
<%   
out.print("Welcome "+request.getParameter("uname")+"<br><br>");  
  
String driver=config.getInitParameter("dname");  
out.print("driver name is="+driver);  
%>
</body>
</html>