<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="pink">
<h1> transaction successfully</h1>
<form action="insertbank">
<input type="hidden" name="shoeid" value=<%=request.getParameter("shoeid") %>>
payment <input type="text" name="pay">
<input type="submit" value="pay">

</body>
</html>