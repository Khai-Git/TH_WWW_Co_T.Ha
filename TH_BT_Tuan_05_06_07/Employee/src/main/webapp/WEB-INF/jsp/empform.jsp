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
<<<<<<< HEAD
		<label>Name:</label>
		<input name="name" />
		<label>Salary:</label>
		<input type="number" name="salary" />
		<label>Des:</label>
		<input name="des" />
		<input type="submit">
=======
		<table>
			<tr>
				<td>Name :</td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td>Salary :</td>
				<td><form:input path="salary" /></td>
			</tr>
			<tr>
				<td>Designation :</td>
				<td><form:input path="designation" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Save" /></td>
			</tr>
		</table>
>>>>>>> d3ed9075c6814857b3b7ccc41bb8cc3b0a582637
	</form:form>
</body>
</html>