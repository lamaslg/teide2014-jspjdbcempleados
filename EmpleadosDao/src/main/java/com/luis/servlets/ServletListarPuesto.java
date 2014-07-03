package com.luis.servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.luis.pojos.Puesto;
import com.luis.repositorios.RepositorioPuestos;

/**
 * Servlet implementation class ServletListarPuesto
 */
@WebServlet("/ServletListarPuesto")
public class ServletListarPuesto extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
			RepositorioPuestos r=new RepositorioPuestos();
			ArrayList<Puesto> lista = null;
			try {
				lista = r.get();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				RequestDispatcher dsp=request.getRequestDispatcher("/error.jsp");
				dsp.forward(request, response);
				return;
			
			}
			request.setAttribute("puestos", lista);
	
			RequestDispatcher dsp=request.getRequestDispatcher("/verPuestos.jsp");
			dsp.forward(request, response);
	
	}

}
