<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Employee</title>
</head>
<body>

	<h1>Employees List</h1>
	<table border="2" width="70%" cellpadding="2">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Salary</th>
			<th>Designation</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>
		<c:forEach var="emp" items="${list}">
			<tr>
				<td>${emp.id}</td>
				<td>${emp.name}</td>
				<td>${emp.salary}</td>
				<td>${emp.designation}</td>
<<<<<<< HEAD
				<td><a href="/BT_TH_05_Employee/emp/editemp/${emp.id}">Edit</a></td>
				<td><a href="/BT_TH_05_Employee/emp/deleteemp/${emp.id}">Delete</a></td>
=======
				<td><a href="/BT_TH_05_Employee/editemp/${emp.id}">Edit</a></td>
				<td><a href="/BT_TH_05_Employee/deleteemp/${emp.id}">Delete</a></td>
>>>>>>> d3ed9075c6814857b3b7ccc41bb8cc3b0a582637
			</tr>
		</c:forEach>
	</table>
	<br />
<<<<<<< HEAD
	<a href="/BT_TH_05_Employee/emp/empform">Add New Employee</a>
=======
	<a href="/BT_TH_05_Employee/empform">Add New Employee</a>
>>>>>>> d3ed9075c6814857b3b7ccc41bb8cc3b0a582637
</body>
</html>