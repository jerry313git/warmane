<%@ page import="com.warmane.dao.RoleDao"%>
<%@page import="org.springframework.web.context.WebApplicationContext"%>
<%@page import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<center>
		<form action="findRole" method="post">
			请输入角色姓名:<input type="text" name="name">
			 <input type="submit" value="确定">  
		</form>

	</center>
</body>
</html>
