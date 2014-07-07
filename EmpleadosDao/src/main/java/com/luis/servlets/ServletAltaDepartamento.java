package com.luis.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.luis.pojos.Departamento;
import com.luis.repositorios.RepositorioDepartamento;

/**
 * Servlet implementation class ServletAltaDepartamento
 */
@WebServlet("/ServletAltaDepartamento")
public class ServletAltaDepartamento extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nombre=request.getParameter("txtNombre");
		String descripcion=request.getParameter("txtDescripcion");
		
		Departamento d=new Departamento(0,nombre,descripcion);
		
		RepositorioDepartamento rd=new RepositorioDepartamento();
		try {
			rd.add(d);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		response.sendRedirect("ServletListarDepartamento");
		
	
	}

}
