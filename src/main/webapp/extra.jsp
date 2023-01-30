<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import ="com.example.demo.*" %>
    <%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body bgcolor="pink">

<%List<Shoe> s= (List<Shoe>)request.getAttribute("list"); %>
<table border ="1" th, td {
  border: 1px solid black;
  border-radius: 10px;
}>
<tr><th>shoeid</th><th>shoename</th><th>shoeprice</th><th>Payment</th></tr>
<%for(Shoe ss:s){ %>
<tr><td><%=ss.getShoeid() %></td><td><%=ss.getShoename() %></td><td><%=ss.getShoeprice() %></td><td><a href ="pay.jsp?shoeid=<%=ss.getShoeid()%>">Payment</a></td></tr> 
<%} %>

</table>

</body>

</html>