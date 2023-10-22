<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Form</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
		<table>
			<tr>
				<td>First Name</td>
				<td><form:input path="firstName" /> <form:errors
						path="firstName"></form:errors></td>
			</tr>
			<tr>
				<td>Last Name</td>
				<td><form:input path="lastName" /></td>
			</tr>
			<tr>
				<td>Country</td>
				<td><form:select path="country">
						<form:options items="${student.countryOptions}"></form:options>
					</form:select></td>
			</tr>
			<tr>
				<td>Favorite Language</td>
				<td><form:radiobuttons path="favoriteLanguage"
						items="${student.favoriteLanguageOptions}"></form:radiobuttons></td>
			</tr>
			<tr>
				<td>Operating Systems</td>
				<td>
				<form:checkboxes path="operatingSystems"
						items="${student.operatingSystemsOptions}">
				</form:checkboxes>
				</td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="submit" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>