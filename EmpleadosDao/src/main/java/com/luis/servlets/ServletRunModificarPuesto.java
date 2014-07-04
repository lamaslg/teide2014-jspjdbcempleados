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

/**
 * Servlet implementation class ServletRunModificarPuesto
 */
@WebServlet("/ServletRunModificarPuesto")
public class ServletRunModificarPuesto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
    		int id=Integer.parseInt(request.getParameter("hidId"));
    		String nombre=request.getParameter("txtNombre");
    		
    		Puesto p=new Puesto(id, nombre);
    		RepositorioPuestos rp=new RepositorioPuestos();
    		try {
				rp.update(p);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		
    		response.sendRedirect("ServletListarPuesto");
    	
    	}

}
