<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Thông tin sinh viên</h2>
	<form:form action="save" method="post">
		<table>
			<tr>
				<td>First Name</td>
				<td><form:input path="fname" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>