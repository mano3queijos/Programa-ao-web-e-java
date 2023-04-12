<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>



<!-- parte de cadastro	 -->
		<form action="./testeServlet" method="post">
			repetir qtd: <input name="repetir" type="text" /><br> <span
				style="color: red;">${erro}</span><br>
			<button type="submit">Enviar</button>

		</form>




</body>
</html>