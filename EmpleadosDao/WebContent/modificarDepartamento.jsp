<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="ServletRunModificarDepartamento" method="post">
<input type="hidden" name="hidId" value="${departamento.idDepartamento }">
	Nombre:<input type="text" name="txtNombre" value="${departamento.nombre}"><br />
	Descripcion:<textarea rows="5" cols="40" name="txtDescripcion" >
		${departamento.descripcion}
	</textarea><br />
	<input type="submit" value="Guardar">
</form> 
</body>
</html>

