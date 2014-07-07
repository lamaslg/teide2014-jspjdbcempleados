package com.luis.servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.luis.pojos.Departamento;
import com.luis.repositorios.RepositorioDepartamento;

/**
 * Servlet implementation class ServletListarDepartamento
 */
@WebServlet("/ServletListarDepartamento")
public class ServletListarDepartamento extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    		
    		RepositorioDepartamento rd=new RepositorioDepartamento();
    		
    		List<Departamento> deps=null;
			try {
				deps = rd.get();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				RequestDispatcher dsp=
	    				request.getRequestDispatcher("/error.jsp");
	    	
	    		dsp.forward(request, response);
	    		return;
			}
    		
    		request.setAttribute("departamentos", deps);
    		RequestDispatcher dsp=
    				request.getRequestDispatcher("/listarDepartamentos.jsp");
    	
    		dsp.forward(request, response);
    	}

}
