<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import ="com.example.demo.*" %>
      <%@page import ="com.example.demo.Shoe" %>
    <%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<%List<Shoe> s= (List<Shoe>)request.getAttribute("list"); %>
<table border ="1">
<tr><th>shoeid</th><th>shoename</th><th>shoeprice</th><th>Buy</th><th>Pay</th></tr>
<%for(Shoe ss:s){ %>
<tr><td><%=ss.getShoeid() %></td><td><%=ss.getShoename() %></td><td><%=ss.getShoeprice() %></td><td><a href="buy.jsp?shoeid=<%=ss.getShoeid() %>">buy shoe</a></td><td><a href ="pay.jsp?shoeid=<%=ss.getShoeid()%>">pay</a></td></tr> 
<%} %>

</table>
</form>
</body>

</html>


