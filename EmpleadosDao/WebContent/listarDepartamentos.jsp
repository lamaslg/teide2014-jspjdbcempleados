<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="altaDepartamento.jsp">Nuevo Departamento</a>
<table>
<c:forEach items="${departamentos}" var="departamento">
	
	<tr>
	<td>${departamento.nombre }</td>
	<td>${departamento.descripcion}</td>
	<td>
	<a href="ServletBorrarDepartamento?id=${departamento.idDepartamento}">Borrar</a>
<a href="ServletModificarDepartamento?id=${departamento.idDepartamento}">Modificar</a>
		
	</td>
	</tr>

</c:forEach>
</table>
</body>
</html>