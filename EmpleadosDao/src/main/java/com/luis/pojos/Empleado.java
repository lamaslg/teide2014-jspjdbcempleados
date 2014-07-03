package com.luis.pojos;

import java.io.Serializable;
import java.util.Date;

public class Empleado implements Serializable{

	private static final long serialVersionUID = 1L;
	private int idEmpleado;
	private String nombre;
	private double salario;
	private Puesto puesto;
	private Date fechaAlta;
	
	
	public Empleado() {
		// TODO Auto-generated constructor stub
	}


	public Empleado(int idEmpleado, String nombre, double salario,
			Puesto puesto, Date fechaAlta) {
		this.idEmpleado = idEmpleado;
		this.nombre = nombre;
		this.salario = salario;
		this.puesto = puesto;
		this.fechaAlta = fechaAlta;
	}


	public int getIdEmpleado() {
		return idEmpleado;
	}


	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


	public Puesto getPuesto() {
		return puesto;
	}


	public void setPuesto(Puesto puesto) {
		this.puesto = puesto;
	}


	public Date getFechaAlta() {
		return fechaAlta;
	}


	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	
	
}
