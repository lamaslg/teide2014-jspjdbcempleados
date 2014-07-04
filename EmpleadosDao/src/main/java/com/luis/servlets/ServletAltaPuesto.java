package com.luis.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.luis.pojos.Puesto;
import com.luis.repositorios.RepositorioPuestos;

@WebServlet("/ServletAltaPuesto")
public class ServletAltaPuesto extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String nombre=request.getParameter("txtNombre");
		
		RepositorioPuestos rp=new RepositorioPuestos();
		Puesto p=new Puesto();
		p.setNombre(nombre);
		
		try {
			rp.add(p);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		response.sendRedirect("ServletListarPuesto");
	
	}

}
