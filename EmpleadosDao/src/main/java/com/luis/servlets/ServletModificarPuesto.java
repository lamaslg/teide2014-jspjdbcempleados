package com.luis.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.luis.pojos.Puesto;
import com.luis.repositorios.RepositorioPuestos;

/**
 * Servlet implementation class ServletModificarPuesto
 */
@WebServlet("/ServletModificarPuesto")
public class ServletModificarPuesto extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		RepositorioPuestos rp=new RepositorioPuestos();
		
		Puesto p = null;
		try {
			p = rp.get(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			RequestDispatcher dsp=request.getRequestDispatcher("/error.jsp");
			dsp.forward(request, response);
		}
		
		request.setAttribute("puesto", p);
		
		RequestDispatcher dsp=request.getRequestDispatcher("/modificar.jsp");
		dsp.forward(request, response);
		
	}

}
