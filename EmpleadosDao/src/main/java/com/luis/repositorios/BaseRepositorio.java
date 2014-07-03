package com.luis.repositorios;

import java.sql.*;

public abstract class BaseRepositorio {

	private final static String CLASE="com.mysql.jdbc.Driver";
	private final static 
			String URL="jdbc:mysql://luisgilpruebas.cloudapp.net:3306/teide2014";
	private final static String USER="teide2014";
	private final static String PWD="teide2014";
	
	public Connection getConexion() throws SQLException{
		
		try {
			Class.forName(CLASE);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new SQLException("Driver no encontrado");
			
		}
		
		return DriverManager.getConnection(URL,USER,PWD);
	}
	
	
}
