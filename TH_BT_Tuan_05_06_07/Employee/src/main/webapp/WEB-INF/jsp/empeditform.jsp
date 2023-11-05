<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Edit Form</title>
</head>
<body>
	<h1>Edit Employee</h1>
<<<<<<< HEAD
	<form:form method="GET" action="/BT_TH_05_Employee/emp/update">
		<input type="hidden" type = "number" name="id" value="${editEmp.getId()}" >
		<label>Name:</label>
		<input type = "text" name="name" value="${editEmp.getName()}" />
		<label>Salary:</label>
		<input type = "number" name="salary" value="${editEmp.getSalary()}" />
		<label>Des:</label>
		<input type = "text" name="des" value="${editEmp.getDesignation()}" />
		<button type="submit"> save </button>
=======
	<form:form method="POST" action="/SpringMVC_CRUD_SQLServer/editsave">
		<table>
			<tr>
				<td></td>
				<td><form:hidden path="id" /></td>
			</tr>
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
				<td></td>
				<td><input type="submit" value="Edit Save" /></td>
			</tr>
		</table>
>>>>>>> d3ed9075c6814857b3b7ccc41bb8cc3b0a582637
	</form:form>
</body>
</html>