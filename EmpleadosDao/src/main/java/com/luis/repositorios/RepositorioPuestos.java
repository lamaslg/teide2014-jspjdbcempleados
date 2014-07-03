package com.luis.repositorios;

import java.util.ArrayList;
import java.sql.*;

import com.luis.pojos.Puesto;

public class RepositorioPuestos extends BaseRepositorio{

	public ArrayList<Puesto> get() throws SQLException{
		
		ArrayList<Puesto> lista=new ArrayList<Puesto>();
		
		Connection conn=getConexion();
		PreparedStatement sentencia=conn.prepareStatement("select * from puesto");
		ResultSet res=sentencia.executeQuery();
		while (res.next()) {
			Puesto p=new Puesto();
			p.setIdPuesto(res.getInt(1));
			p.setNombre(res.getString(2));
			lista.add(p);
		}
		
		res.close();
		sentencia.close();
		conn.close();
		
		return lista;
		
		
	}
	public Puesto get(int id) throws SQLException{
		Puesto p=null;
		
		Connection conn=getConexion();
		PreparedStatement sentencia=conn.
				prepareStatement("select * from puesto where idPuesto=?");
		sentencia.setInt(1, id);
		ResultSet res=sentencia.executeQuery();
		if (res.next()) {
			p=new Puesto();
			p.setIdPuesto(res.getInt(1));
			p.setNombre(res.getString(2));
		}
		
		res.close();
		sentencia.close();
		conn.close();
		
		return p;
	}
	public int add(Puesto p) throws SQLException{
		int n=0;
		
		Connection conn=getConexion();
PreparedStatement sentencia=conn.prepareStatement("insert into puesto (nombre) "+
			"values(?)");
		sentencia.setString(1, p.getNombre());
		n=sentencia.executeUpdate();
		sentencia.close();
		conn.close();
		
		return n;
		}
	
	public int update(Puesto p) throws SQLException{
		int n=0;
		
		Connection conn=getConexion();
	PreparedStatement sentencia=conn.prepareStatement("update puesto set nombre=?"+
		" where idPuesto=?");
		sentencia.setString(1, p.getNombre());
		sentencia.setInt(2, p.getIdPuesto());
		
		n=sentencia.executeUpdate();
		sentencia.close();
		conn.close();
		
		return n;
		
		
	}
	public int delete(int idPuesto) throws SQLException{
		int n=0;
		Connection conn=getConexion();
PreparedStatement sentencia=conn.prepareStatement("delete puesto where idPuesto=?");
		sentencia.setInt(1, idPuesto);
		
		n=sentencia.executeUpdate();
		sentencia.close();
		conn.close();
		
		return n;
		
		
	}
	
	

}






