<%@page import="br.com.caelum.servlet.dao.ContactDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@
page
	import="br.com.caelum.servlet.dao.ContactDao, 
	br.com.caelum.servlet.domain.Contact,
	br.com.caelum.servlet.AdicionaContatoServlet"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<!-- Estudar Banco de dados e sql com URGÊNCIA  -->


	<%
	for (Contact contact : ContactDao.getContacts()) {
	%>
	<tr>
		<td><%=contact.getName()%></td>
		<td><%=contact.getDateOfBirth()%></td>
		<td><%=contact.getAddress() %></td>
		<td><%=contact.getEmail() %></td>
	</tr>
	<%
	}
	%>

</body>
</html>