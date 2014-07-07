package com.luis.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.luis.repositorios.RepositorioDepartamento;

/**
 * Servlet implementation class ServletBorrarDepartamento
 */
@WebServlet("/ServletBorrarDepartamento")
public class ServletBorrarDepartamento extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		
		RepositorioDepartamento rd=new RepositorioDepartamento();
		try {
			rd.delete(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		response.sendRedirect("ServletListarDepartamento");
		
		
	
	}

}
