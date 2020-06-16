<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%--Esto es una directiva para utilizar la clase Date --%>
	<%@ page import="java.util.Date"  %>
	
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix= "fmt" uri ="http://java.sun.com/jsp/jstl/fmt"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bienvenido a Práctica 2</title>
</head>
<body>
	Bienvenido a la practica 2 
	<br>
	<form action="/JSP/MyServlet" method="POST">
		<input type="submit" name="btnAceptar" value="Actualizar Fecha">
	</form>
	
	<p>Formatted Name:<c:out value="${bean.name}"></c:out></p>
	
	<p>Formatted Date (3): <fmt:formatDate type="both" value = "${bean.date}" /></p>
		
		
	<%--Navegador y Version del Sistema Operativo --%>
	<% out.print(request.getHeader("USER-AGENT")); %>
	
	
</body>
</html>