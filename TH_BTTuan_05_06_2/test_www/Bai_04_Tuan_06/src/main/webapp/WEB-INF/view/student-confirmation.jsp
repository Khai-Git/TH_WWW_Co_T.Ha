<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Form</title>
</head>
<body>
	The student is confirmed: ${student.firstName} ${student.lastName}
	<br>
	<br> Country: ${student.country}
	<br>
	<br> Favorite Language: ${student.favoriteLanguage}
	<br>
	<br> Operating Systems:
	<ul>
		<c:forEach var="temp" items="${student.operatingSystems}">
			<li>${temp}</li>
		</c:forEach>
		<a href="showForm">Back to Form</a>
	</ul>
</body>
</html>