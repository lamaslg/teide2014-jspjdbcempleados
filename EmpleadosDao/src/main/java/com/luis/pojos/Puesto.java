package com.luis.pojos;

import java.io.Serializable;

public class Puesto implements Serializable{

	private int idPuesto;
	private String nombre;
	
	public Puesto() {
		// TODO Auto-generated constructor stub
	}

	public Puesto(int idPuesto, String nombre) {
		this.idPuesto = idPuesto;
		this.nombre = nombre;
	}

	public int getIdPuesto() {
		return idPuesto;
	}

	public void setIdPuesto(int idPuesto) {
		this.idPuesto = idPuesto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
