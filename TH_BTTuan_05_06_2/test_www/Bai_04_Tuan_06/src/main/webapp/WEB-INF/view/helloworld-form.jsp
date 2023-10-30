<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello World - Input Form</title>
</head>
<body>
	<form action="processForm" method="post">
		<input type="text" name="studentName" placeholder="what's your name?" />
		<input type="submit" />
	</form>
</body>
</html>