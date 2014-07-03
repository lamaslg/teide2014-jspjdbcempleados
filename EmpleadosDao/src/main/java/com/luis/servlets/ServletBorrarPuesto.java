package com.luis.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.luis.repositorios.RepositorioPuestos;

/**
 * Servlet implementation class ServletBorrarPuesto
 */
@WebServlet("/ServletBorrarPuesto")
public class ServletBorrarPuesto extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		
		RepositorioPuestos rp=new RepositorioPuestos();
		try {
			rp.delete(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect("/ServletListarPuesto");
	}

}
