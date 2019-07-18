<%-- 
    Document   : logout
    Created on : 8 May, 2017, 10:23:14 AM
    Author     : purvanshi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
session.setAttribute("userid", null);
session.invalidate();
response.sendRedirect("index.html");
%>
    </body>
</html>
