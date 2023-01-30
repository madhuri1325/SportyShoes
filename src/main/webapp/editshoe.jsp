<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="pink">
<h1><i>Editing Shoe</i></h1>
<form action="editcontroller">
<input type="hidden" name="shoeid" value=<%=request.getParameter("shoeid") %>>
Name to be edited <input type="text" name="shoename">
<input type="submit" value="edit">
</form>
</body>
</html>


