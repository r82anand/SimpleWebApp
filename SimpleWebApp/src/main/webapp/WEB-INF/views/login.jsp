<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Simple Web Application</title>
</head>
<body>
<div>
<font color="red">
${message}
</font>
</div>

	<form action="/login.do" method="post">
		Enter User Name: <input type="text" name="name" /><br /> 
		Enter Password: <input type="password" name="password"> <br/>
		<input type="submit" name="Login" >
	</form>
</body>
</html>