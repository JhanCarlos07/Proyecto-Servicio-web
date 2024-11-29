package com.proyecto.proyectofinal.entety;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name="Personal")
@Table(name="personal")
public class Personal {

	@Id
	String dni;
	String direccion;
	String cel;
	public Personal() {
		super();
	}
	public Personal(String dni, String direccion, String cel) {
		super();
		this.dni = dni;
		this.direccion = direccion;
		this.cel = cel;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCel() {
		return cel;
	}
	public void setCel(String cel) {
		this.cel = cel;
	}
	
	

}
