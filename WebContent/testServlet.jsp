<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


	<h1>servlet1</h1>
	<form  action="${pageContext.request.contextPath }/servlet_servlet1" method="post">
		<input type="text" name="name" placeholder="用户名">
		<br>
		<input type="text" name="email" placeholder="邮箱"/>
		<br>
		<input type="submit" value="提交">
	</form>
	
	<br><br>
	
	<h1>servlet2</h1>
	<form  action="${pageContext.request.contextPath }/servlet_servlet2" method="post">
		<input type="text" name="name" placeholder="用户名">
		<br>
		<input type="text" name="email" placeholder="邮箱"/>
		<br>
		<input type="submit" value="提交">
	</form>
	
	<br><br>
	
	<h1>servlet3</h1>
	<form  action="${pageContext.request.contextPath }/servlet_servlet3" method="post">
		<input type="submit" value="提交">
	</form>

</body>
</html>