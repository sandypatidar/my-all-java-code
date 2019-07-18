<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
	<jsp:useBean id="u" class="jspBeans.User"></jsp:useBean>
	<jsp:setProperty property="*" name="u"/>
	Record:<br>
	<jsp:getProperty property="name" name="u"/><br>
	<jsp:getProperty property="password" name="u"/><br>
	<jsp:getProperty property="email" name="u"/><br>
</body>
</html>