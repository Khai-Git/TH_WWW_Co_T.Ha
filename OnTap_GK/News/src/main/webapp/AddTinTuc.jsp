<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="ListTinTucServlet" method="get">
		<input type="hidden" name="command" value="ADD" /> <label>Tieu
			De</label> <br>
		<input name="tieuDe" type="text"><br> <label>Noi
			Dung Tin Tuc</label> <br>
		<input name="noiDungTT" type="text"><br> <label>Lien
			Ket</label> <br>
		<input name="lienKet" type="text"><br> <label>Ma
			Danh Muc</label> <br>
		<input name="maDM" type="text"><br> <input type="Submit"
			value="Save">
	</form>
	<p>
		<a href="ListTinTucServlet">Back to List</a>
	</p>
</body>
</html>