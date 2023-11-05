<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="customer">
		<table>
			<tr>
				<td>First Name</td>
				<td><form:input path="firstName" /> <form:errors
						path="firstName" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Last Name (*)</td>
				<td><form:input path="lastName" /> <form:errors
						path="lastName"></form:errors></td>
			</tr>
			<tr>
				<td>Free passes</td>
				<td><form:input path="freePasses" /> <form:errors
						path="freePasses" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Postal Code</td>
				<td><form:input path="postalCode" /></td>
			</tr>
			<tr>
				<td>Course Code</td>
				<td><form:input path="courseCode" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="submit" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>