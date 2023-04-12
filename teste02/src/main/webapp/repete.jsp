
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%-- 	<h1>oi</h1>
	
	Bem vindo, ${usuario}! --%>
	<form action="./testeServlet" method="post">

		<c:forEach begin="0" end="${qtd-1}" varStatus="loop">


			sla: <input  name="manda" type="text" />
		</c:forEach>
		<button type="submit">Enviar</button>

	</form>


</body>
</html>