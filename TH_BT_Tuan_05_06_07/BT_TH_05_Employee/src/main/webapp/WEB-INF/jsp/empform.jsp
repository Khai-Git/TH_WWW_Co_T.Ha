<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Form</title>
</head>
<body>
	<form:form method="post" action="save">
		<label>Name:</label>
		<input name="name" />
		<label>Salary:</label>
		<input type="number" name="salary" />
		<label>Des:</label>
		<input name="des" />
		<input type="submit">
	</form:form>
</body>
</html>