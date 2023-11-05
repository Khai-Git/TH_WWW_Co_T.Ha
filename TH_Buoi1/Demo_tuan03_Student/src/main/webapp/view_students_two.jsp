<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Student Table Demo</h2>
	<hr>
	<br />
	<table border="1">
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email Name</th>
		</tr>

		<c:forEach var="tempStudent" items="${student_list}">
			<tr>
				<th>${tempStudent.firstName}</th>
				<th>${tempStudent.lastName}</th>
				<th>${tempStudent.email}</th>
			</tr>
		</c:forEach>

	</table>
	
	<form action="/Demo_tuan03_Student/MvcDemoServletTwo" method="post">
		First Name: <input type="text" name="firstName"><br> Last
		Name: <input type="text" name="lastName"><br> Email: <input
			type="text" name="email"><br> <input type="submit"
			value="Submit">
	</form>
	
	<h2>Student Information</h2>
	<p>
		First Name:
		<%=request.getAttribute("firstName")%></p>
	<p>
		Last Name:
		<%=request.getAttribute("lastName")%></p>
	<p>
		Email:
		<%=request.getAttribute("email")%></p>

	
</body>
</html>