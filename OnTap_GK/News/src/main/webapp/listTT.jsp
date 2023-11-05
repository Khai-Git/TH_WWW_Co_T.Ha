<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.tbl {
	width: 100%;
	border-collapse: collapse;
}

.tbl, tr, td {
	border: 1px solid brown;
}
</style>
</head>
<body>


	<input type='button' value='Add Tin Tuc'
		onclick="window.location.href='AddTinTuc.jsp'; return false">
	<table class='tbl'>
		<tr>

			<th>tieuDe</th>
			<th>noiDung</th>
			<th>lienKet</th>
			<th>maDM</th>
		</tr>
		<c:forEach var="tempTinTuc" items="${TINTUC_LIST}">
			<c:url var="tempLink" value="ListTinTucServlet">
				<c:param name="command" value="LIST" />
				<c:param name="maTT" value="${tempTinTuc.maTT}" />
			</c:url>

			<c:url var="tempDelete" value="ListTinTucServlet">
				<c:param name="command" value="DELETE" />
				<c:param name="tinTucId" value="${tempTinTuc.maTT}" />
			</c:url>

			<TR>
				<td>${tempTinTuc.tieuDe}</td>
				<td>${tempTinTuc.noiDungTT}</td>
				<td>${tempTinTuc.lienKet}</td>
				<td>${tempTinTuc.maDM}</td>
				<td><a href="${tempDelete}">delete</a></td>
			</TR>



		</c:forEach>
	</table>

</body>
</html>