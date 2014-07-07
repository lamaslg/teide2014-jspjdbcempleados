package com.luis.repositorios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.luis.pojos.Departamento;
import com.luis.pojos.Puesto;

public class RepositorioDepartamento extends BaseRepositorio{
public ArrayList<Departamento> get() throws SQLException{
		
		ArrayList<Departamento> lista=new ArrayList<Departamento>();
		
		Connection conn=getConexion();
		PreparedStatement sentencia=conn.prepareStatement("select * from departamento");
		ResultSet res=sentencia.executeQuery();
		while (res.next()) {
			Departamento d=new Departamento();
			d.setIdDepartamento(res.getInt(1));
			d.setNombre(res.getString(2));
			d.setDescripcion(res.getString(3));
			lista.add(d);
		}
		
		res.close();
		sentencia.close();
		conn.close();
		
		return lista;
		
		
	}
	public Departamento get(int id) throws SQLException{
		Departamento d=null;
		
		Connection conn=getConexion();
		PreparedStatement sentencia=conn.
				prepareStatement("select * from departamento where idDepartamento=?");
		sentencia.setInt(1, id);
		ResultSet res=sentencia.executeQuery();
		if (res.next()) {
			d=new Departamento();
			d.setIdDepartamento(res.getInt(1));
			d.setNombre(res.getString(2));
			d.setDescripcion(res.getString(3));
		}
		
		res.close();
		sentencia.close();
		conn.close();
		
		return d;
	}
	public int add(Departamento d) throws SQLException{
		int n=0;
		
		Connection conn=getConexion();
PreparedStatement sentencia=conn.prepareStatement("insert into departamento (nombre,descripcion) "+
			"values(?,?)");
		sentencia.setString(1, d.getNombre());
		sentencia.setString(2, d.getDescripcion());
		n=sentencia.executeUpdate();
		sentencia.close();
		conn.close();
		
		return n;
		}
	
	public int update(Departamento d) throws SQLException{
		int n=0;
		
		Connection conn=getConexion();
	PreparedStatement sentencia=conn.prepareStatement("update departamento set nombre=?,descripcion=?"+
		" where idDepartamento=?");
		sentencia.setString(1, d.getNombre());
		sentencia.setString(2, d.getDescripcion());
		sentencia.setInt(3, d.getIdDepartamento());
		
		n=sentencia.executeUpdate();
		sentencia.close();
		conn.close();
		
		return n;
		
		
	}
	public int delete(int idDepartamento) throws SQLException{
		int n=0;
		Connection conn=getConexion();
PreparedStatement sentencia=conn.prepareStatement("delete from departamento where idDepartamento=?");
		sentencia.setInt(1, idDepartamento);
		
		n=sentencia.executeUpdate();
		sentencia.close();
		conn.close();
		
		return n;
		
		
	}
}
